package mage.cards.p;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.effects.ContinuousRuleModifyingEffect;
import mage.abilities.effects.ContinuousRuleModifyingEffectImpl;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.RestrictionEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;

/**
 *
 * @author jeffwadsworth
 */
public final class PeaceTalks extends CardImpl {

    public PeaceTalks(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{W}");

        // This turn and next turn, creatures can't attack, 
        // and players and permanents can't be the targets 
        // of spells or activated abilities.
        this.getSpellAbility().addEffect(new PeaceTalksEffect());

    }

    private PeaceTalks(final PeaceTalks card) {
        super(card);
    }

    @Override
    public PeaceTalks copy() {
        return new PeaceTalks(this);
    }
}

class PeaceTalksEffect extends OneShotEffect {

    public PeaceTalksEffect() {
        super(Outcome.Neutral);
        this.staticText = "This turn and next turn, creatures can't attack,"
                + "and players and permanents can't be the targets of spells "
                + "or activated abilities";
    }

    public PeaceTalksEffect(final PeaceTalksEffect effect) {
        super(effect);
    }

    @Override
    public PeaceTalksEffect copy() {
        return new PeaceTalksEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        RestrictionEffect effect = new PeaceTalksCantAttackEffect();
        game.addEffect(effect, source);
        ContinuousRuleModifyingEffect effect2 = new PeaceTalksPlayersAndPermanentsCantBeTargetsOfSpellsOrActivatedAbilities();
        game.addEffect(effect2, source);
        return true;
    }
}

class PeaceTalksCantAttackEffect extends RestrictionEffect {

    public PeaceTalksCantAttackEffect() {
        super(Duration.Custom);
        staticText = "Creatures can't attack this turn and next turn";
    }

    public PeaceTalksCantAttackEffect(final PeaceTalksCantAttackEffect effect) {
        super(effect);
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        return permanent.isCreature();
    }

    @Override
    public boolean canAttack(Game game) {
        return false;
    }

    @Override
    public PeaceTalksCantAttackEffect copy() {
        return new PeaceTalksCantAttackEffect(this);
    }

    @Override
    public boolean isInactive(Ability source, Game game) {
        if (startingTurn + 2 == game.getTurnNum()) {
            this.discard();
            return true;
        }
        return false;
    }
}

class PeaceTalksPlayersAndPermanentsCantBeTargetsOfSpellsOrActivatedAbilities extends ContinuousRuleModifyingEffectImpl {

    public PeaceTalksPlayersAndPermanentsCantBeTargetsOfSpellsOrActivatedAbilities() {
        super(Duration.Custom, Outcome.Neutral);
        staticText = "players and permanents can't be the targets of spells or activated abilities";
    }

    public PeaceTalksPlayersAndPermanentsCantBeTargetsOfSpellsOrActivatedAbilities(final PeaceTalksPlayersAndPermanentsCantBeTargetsOfSpellsOrActivatedAbilities effect) {
        super(effect);
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.CAST_SPELL
                || event.getType() == GameEvent.EventType.ACTIVATE_ABILITY;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        for (UUID playerId : game.getPlayer(source.getControllerId()).getInRange()) {
            if (event.getTargetId().equals(playerId)) {
                return false;
            }
        }
        for (Permanent permanent : game.getBattlefield().getAllActivePermanents()) {
            if (event.getTargetId().equals(permanent.getId())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public PeaceTalksPlayersAndPermanentsCantBeTargetsOfSpellsOrActivatedAbilities copy() {
        return new PeaceTalksPlayersAndPermanentsCantBeTargetsOfSpellsOrActivatedAbilities(this);
    }
    
    @Override
    public boolean isInactive(Ability source, Game game) {
        if (startingTurn + 2 == game.getTurnNum()) {
            this.discard();
            return true;
        }
        return false;
    }
}