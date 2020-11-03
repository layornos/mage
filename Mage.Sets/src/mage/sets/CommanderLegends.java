package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class CommanderLegends extends ExpansionSet {

    private static final CommanderLegends instance = new CommanderLegends();

    public static CommanderLegends getInstance() {
        return instance;
    }

    private CommanderLegends() {
        super("Commander Legends", "CMR", ExpansionSet.buildDate(2020, 11, 1), SetType.SUPPLEMENTAL);
        this.blockName = "Commander Legends";
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.maxCardNumberInBooster = 361;

        cards.add(new SetCardInfo("Acidic Slime", 421, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Akiri, Line-Slinger", 515, Rarity.MYTHIC, mage.cards.a.AkiriLineSlinger.class));
        cards.add(new SetCardInfo("Alena, Kessig Trapper", 160, Rarity.UNCOMMON, mage.cards.a.AlenaKessigTrapper.class));
        cards.add(new SetCardInfo("Amareth, the Lustrous", 266, Rarity.RARE, mage.cards.a.AmarethTheLustrous.class));
        cards.add(new SetCardInfo("Amphin Mutineer", 55, Rarity.RARE, mage.cards.a.AmphinMutineer.class));
        cards.add(new SetCardInfo("Ancestral Blade", 5, Rarity.COMMON, mage.cards.a.AncestralBlade.class));
        cards.add(new SetCardInfo("Ancient Animus", 215, Rarity.COMMON, mage.cards.a.AncientAnimus.class));
        cards.add(new SetCardInfo("Apex Devastator", 217, Rarity.MYTHIC, mage.cards.a.ApexDevastator.class));
        cards.add(new SetCardInfo("Arcane Signet", 297, Rarity.UNCOMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archelos, Lagoon Mystic", 268, Rarity.RARE, mage.cards.a.ArchelosLagoonMystic.class));
        cards.add(new SetCardInfo("Archon of Coronation", 9, Rarity.MYTHIC, mage.cards.a.ArchonOfCoronation.class));
        cards.add(new SetCardInfo("Ardenn, Intrepid Archaeologist", 10, Rarity.UNCOMMON, mage.cards.a.ArdennIntrepidArchaeologist.class));
        cards.add(new SetCardInfo("Armillary Sphere", 298, Rarity.COMMON, mage.cards.a.ArmillarySphere.class));
        cards.add(new SetCardInfo("Armix, Filigree Thrasher", 108, Rarity.UNCOMMON, mage.cards.a.ArmixFiligreeThrasher.class));
        cards.add(new SetCardInfo("Armorcraft Judge", 218, Rarity.UNCOMMON, mage.cards.a.ArmorcraftJudge.class));
        cards.add(new SetCardInfo("Aurora Phoenix", 161, Rarity.RARE, mage.cards.a.AuroraPhoenix.class));
        cards.add(new SetCardInfo("Austere Command", 12, Rarity.RARE, mage.cards.a.AustereCommand.class));
        cards.add(new SetCardInfo("Averna, the Chaos Bloom", 269, Rarity.RARE, mage.cards.a.AvernaTheChaosBloom.class));
        cards.add(new SetCardInfo("Belbe, Corrupted Observer", 270, Rarity.RARE, mage.cards.b.BelbeCorruptedObserver.class));
        cards.add(new SetCardInfo("Bitter Revelation", 109, Rarity.COMMON, mage.cards.b.BitterRevelation.class));
        cards.add(new SetCardInfo("Bladegriff Prototype", 300, Rarity.RARE, mage.cards.b.BladegriffPrototype.class));
        cards.add(new SetCardInfo("Blasphemous Act", 162, Rarity.RARE, mage.cards.b.BlasphemousAct.class));
        cards.add(new SetCardInfo("Blim, Comedic Genius", 272, Rarity.RARE, mage.cards.b.BlimComedicGenius.class));
        cards.add(new SetCardInfo("Boros Charm", 442, Rarity.UNCOMMON, mage.cards.b.BorosCharm.class));
        cards.add(new SetCardInfo("Brago, King Eternal", 516, Rarity.MYTHIC, mage.cards.b.BragoKingEternal.class));
        cards.add(new SetCardInfo("Brazen Freebooter", 164, Rarity.COMMON, mage.cards.b.BrazenFreebooter.class));
        cards.add(new SetCardInfo("Briarblade Adept", 111, Rarity.COMMON, mage.cards.b.BriarbladeAdept.class));
        cards.add(new SetCardInfo("Brinelin, the Moon Kraken", 60, Rarity.UNCOMMON, mage.cards.b.BrinelinTheMoonKraken.class));
        cards.add(new SetCardInfo("Cage of Hands", 14, Rarity.COMMON, mage.cards.c.CageOfHands.class));
        cards.add(new SetCardInfo("Captain's Call", 15, Rarity.COMMON, mage.cards.c.CaptainsCall.class));
        cards.add(new SetCardInfo("Cast Down", 112, Rarity.UNCOMMON, mage.cards.c.CastDown.class));
        cards.add(new SetCardInfo("Charcoal Diamond", 303, Rarity.COMMON, mage.cards.c.CharcoalDiamond.class));
        cards.add(new SetCardInfo("Coastline Marauders", 168, Rarity.UNCOMMON, mage.cards.c.CoastlineMarauders.class));
        cards.add(new SetCardInfo("Coiling Oracle", 443, Rarity.COMMON, mage.cards.c.CoilingOracle.class));
        cards.add(new SetCardInfo("Colfenor, the Last Yew", 274, Rarity.RARE, mage.cards.c.ColfenorTheLastYew.class));
        cards.add(new SetCardInfo("Command Beacon", 349, Rarity.RARE, mage.cards.c.CommandBeacon.class));
        cards.add(new SetCardInfo("Command Tower", 350, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 306, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Confiscate", 62, Rarity.UNCOMMON, mage.cards.c.Confiscate.class));
        cards.add(new SetCardInfo("Court Street Denizen", 17, Rarity.COMMON, mage.cards.c.CourtStreetDenizen.class));
        cards.add(new SetCardInfo("Court of Bounty", 220, Rarity.RARE, mage.cards.c.CourtOfBounty.class));
        cards.add(new SetCardInfo("Court of Cunning", 63, Rarity.RARE, mage.cards.c.CourtOfCunning.class));
        cards.add(new SetCardInfo("Court of Grace", 16, Rarity.RARE, mage.cards.c.CourtOfGrace.class));
        cards.add(new SetCardInfo("Crow of Dark Tidings", 115, Rarity.COMMON, mage.cards.c.CrowOfDarkTidings.class));
        cards.add(new SetCardInfo("Cuombajj Witches", 116, Rarity.UNCOMMON, mage.cards.c.CuombajjWitches.class));
        cards.add(new SetCardInfo("Demonic Lore", 118, Rarity.UNCOMMON, mage.cards.d.DemonicLore.class));
        cards.add(new SetCardInfo("Deranged Assistant", 65, Rarity.COMMON, mage.cards.d.DerangedAssistant.class));
        cards.add(new SetCardInfo("Derevi, Empyrial Tactician", 518, Rarity.MYTHIC, mage.cards.d.DereviEmpyrialTactician.class));
        cards.add(new SetCardInfo("Doomed Traveler", 19, Rarity.COMMON, mage.cards.d.DoomedTraveler.class));
        cards.add(new SetCardInfo("Dragon Mantle", 174, Rarity.COMMON, mage.cards.d.DragonMantle.class));
        cards.add(new SetCardInfo("Eligeth, Crossroads Augur", 66, Rarity.RARE, mage.cards.e.EligethCrossroadsAugur.class));
        cards.add(new SetCardInfo("Emberwilde Captain", 175, Rarity.RARE, mage.cards.e.EmberwildeCaptain.class));
        cards.add(new SetCardInfo("Entourage of Trest", 224, Rarity.COMMON, mage.cards.e.EntourageOfTrest.class));
        cards.add(new SetCardInfo("Exquisite Huntmaster", 122, Rarity.COMMON, mage.cards.e.ExquisiteHuntmaster.class));
        cards.add(new SetCardInfo("Eyeblight Cullers", 124, Rarity.COMMON, mage.cards.e.EyeblightCullers.class));
        cards.add(new SetCardInfo("Fact or Fiction", 396, Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Faith's Fetters", 20, Rarity.COMMON, mage.cards.f.FaithsFetters.class));
        cards.add(new SetCardInfo("Fall from Favor", 68, Rarity.COMMON, mage.cards.f.FallFromFavor.class));
        cards.add(new SetCardInfo("Falthis, Shadowcat Familiar", 126, Rarity.UNCOMMON, mage.cards.f.FalthisShadowcatFamiliar.class));
        cards.add(new SetCardInfo("Farhaven Elf", 225, Rarity.COMMON, mage.cards.f.FarhavenElf.class));
        cards.add(new SetCardInfo("Fertilid", 226, Rarity.COMMON, mage.cards.f.Fertilid.class));
        cards.add(new SetCardInfo("Filigree Familiar", 308, Rarity.COMMON, mage.cards.f.FiligreeFamiliar.class));
        cards.add(new SetCardInfo("Fire Diamond", 309, Rarity.COMMON, mage.cards.f.FireDiamond.class));
        cards.add(new SetCardInfo("First Response", 22, Rarity.UNCOMMON, mage.cards.f.FirstResponse.class));
        cards.add(new SetCardInfo("Fleshbag Marauder", 128, Rarity.COMMON, mage.cards.f.FleshbagMarauder.class));
        cards.add(new SetCardInfo("Flood of Recollection", 61, Rarity.COMMON, mage.cards.f.FloodOfRecollection.class));
        cards.add(new SetCardInfo("Forceful Denial", 69, Rarity.COMMON, mage.cards.f.ForcefulDenial.class));
        cards.add(new SetCardInfo("Furnace Celebration", 181, Rarity.UNCOMMON, mage.cards.f.FurnaceCelebration.class));
        cards.add(new SetCardInfo("Fyndhorn Elves", 228, Rarity.COMMON, mage.cards.f.FyndhornElves.class));
        cards.add(new SetCardInfo("Ghastly Demise", 129, Rarity.COMMON, mage.cards.g.GhastlyDemise.class));
        cards.add(new SetCardInfo("Ghen, Arcanum Weaver", 275, Rarity.RARE, mage.cards.g.GhenArcanumWeaver.class));
        cards.add(new SetCardInfo("Ghost of Ramirez DePietro", 71, Rarity.UNCOMMON, mage.cards.g.GhostOfRamirezDePietro.class));
        cards.add(new SetCardInfo("Gift of Paradise", 229, Rarity.COMMON, mage.cards.g.GiftOfParadise.class));
        cards.add(new SetCardInfo("Gnostro, Voice of the Crags", 276, Rarity.RARE, mage.cards.g.GnostroVoiceOfTheCrags.class));
        cards.add(new SetCardInfo("Gor Muldrak, Amphinologist", 277, Rarity.RARE, mage.cards.g.GorMuldrakAmphinologist.class));
        cards.add(new SetCardInfo("Halana, Kessig Ranger", 231, Rarity.UNCOMMON, mage.cards.h.HalanaKessigRanger.class));
        cards.add(new SetCardInfo("Horizon Scholar", 73, Rarity.UNCOMMON, mage.cards.h.HorizonScholar.class));
        cards.add(new SetCardInfo("Horizon Stone", 315, Rarity.RARE, mage.cards.h.HorizonStone.class));
        cards.add(new SetCardInfo("Hunter's Insight", 232, Rarity.UNCOMMON, mage.cards.h.HuntersInsight.class));
        cards.add(new SetCardInfo("Ikra Shidiqi, the Usurper", 519, Rarity.MYTHIC, mage.cards.i.IkraShidiqiTheUsurper.class));
        cards.add(new SetCardInfo("Immaculate Magistrate", 234, Rarity.RARE, mage.cards.i.ImmaculateMagistrate.class));
        cards.add(new SetCardInfo("Imoti, Celebrant of Bounty", 280, Rarity.UNCOMMON, mage.cards.i.ImotiCelebrantOfBounty.class));
        cards.add(new SetCardInfo("Imperious Perfect", 235, Rarity.UNCOMMON, mage.cards.i.ImperiousPerfect.class));
        cards.add(new SetCardInfo("Inspiring Roar", 23, Rarity.COMMON, mage.cards.i.InspiringRoar.class));
        cards.add(new SetCardInfo("Intangible Virtue", 24, Rarity.UNCOMMON, mage.cards.i.IntangibleVirtue.class));
        cards.add(new SetCardInfo("Interpret the Signs", 75, Rarity.UNCOMMON, mage.cards.i.InterpretTheSigns.class));
        cards.add(new SetCardInfo("Jeska's Will", 187, Rarity.RARE, mage.cards.j.JeskasWill.class));
        cards.add(new SetCardInfo("Jeska, Thrice Reborn", 186, Rarity.MYTHIC, mage.cards.j.JeskaThriceReborn.class));
        cards.add(new SetCardInfo("Jeweled Lotus", 319, Rarity.MYTHIC, mage.cards.j.JeweledLotus.class));
        cards.add(new SetCardInfo("Kamahl's Will", 238, Rarity.RARE, mage.cards.k.KamahlsWill.class));
        cards.add(new SetCardInfo("Kamahl, Heart of Krosa", 237, Rarity.MYTHIC, mage.cards.k.KamahlHeartOfKrosa.class));
        cards.add(new SetCardInfo("Kediss, Emberclaw Familiar", 188, Rarity.UNCOMMON, mage.cards.k.KedissEmberclawFamiliar.class));
        cards.add(new SetCardInfo("Keeper of the Accord", 27, Rarity.RARE, mage.cards.k.KeeperOfTheAccord.class));
        cards.add(new SetCardInfo("Keleth, Sunmane Familiar", 28, Rarity.UNCOMMON, mage.cards.k.KelethSunmaneFamiliar.class));
        cards.add(new SetCardInfo("Keskit, the Flesh Sculptor", 131, Rarity.UNCOMMON, mage.cards.k.KeskitTheFleshSculptor.class));
        cards.add(new SetCardInfo("Kinsbaile Courier", 29, Rarity.COMMON, mage.cards.k.KinsbaileCourier.class));
        cards.add(new SetCardInfo("Kitesail Corsair", 76, Rarity.COMMON, mage.cards.k.KitesailCorsair.class));
        cards.add(new SetCardInfo("Kitesail Skirmisher", 77, Rarity.COMMON, mage.cards.k.KitesailSkirmisher.class));
        cards.add(new SetCardInfo("Kodama of the East Tree", 239, Rarity.RARE, mage.cards.k.KodamaOfTheEastTree.class));
        cards.add(new SetCardInfo("Kor Cartographer", 30, Rarity.COMMON, mage.cards.k.KorCartographer.class));
        cards.add(new SetCardInfo("Krark, the Thumbless", 189, Rarity.RARE, mage.cards.k.KrarkTheThumbless.class));
        cards.add(new SetCardInfo("Kydele, Chosen of Kruphix", 524, Rarity.MYTHIC, mage.cards.k.KydeleChosenOfKruphix.class));
        cards.add(new SetCardInfo("Laboratory Drudge", 78, Rarity.RARE, mage.cards.l.LaboratoryDrudge.class));
        cards.add(new SetCardInfo("Livio, Oathsworn Sentinel", 31, Rarity.RARE, mage.cards.l.LivioOathswornSentinel.class));
        cards.add(new SetCardInfo("Ludevic, Necro-Alchemist", 525, Rarity.MYTHIC, mage.cards.l.LudevicNecroAlchemist.class));
        cards.add(new SetCardInfo("Maelstrom Colossus", 322, Rarity.COMMON, mage.cards.m.MaelstromColossus.class));
        cards.add(new SetCardInfo("Maelstrom Wanderer", 526, Rarity.MYTHIC, mage.cards.m.MaelstromWanderer.class));
        cards.add(new SetCardInfo("Magus of the Order", 242, Rarity.RARE, mage.cards.m.MagusOfTheOrder.class));
        cards.add(new SetCardInfo("Makeshift Munitions", 191, Rarity.COMMON, mage.cards.m.MakeshiftMunitions.class));
        cards.add(new SetCardInfo("Mana Confluence", 721, Rarity.MYTHIC, mage.cards.m.ManaConfluence.class));
        cards.add(new SetCardInfo("Marble Diamond", 323, Rarity.COMMON, mage.cards.m.MarbleDiamond.class));
        cards.add(new SetCardInfo("Mask of Memory", 324, Rarity.UNCOMMON, mage.cards.m.MaskOfMemory.class));
        cards.add(new SetCardInfo("Merchant Raiders", 81, Rarity.UNCOMMON, mage.cards.m.MerchantRaiders.class));
        cards.add(new SetCardInfo("Meteoric Mace", 192, Rarity.UNCOMMON, mage.cards.m.MeteoricMace.class));
        cards.add(new SetCardInfo("Mindless Automaton", 326, Rarity.UNCOMMON, mage.cards.m.MindlessAutomaton.class));
        cards.add(new SetCardInfo("Mnemonic Deluge", 82, Rarity.MYTHIC, mage.cards.m.MnemonicDeluge.class));
        cards.add(new SetCardInfo("Mulldrifter", 400, Rarity.UNCOMMON, mage.cards.m.Mulldrifter.class));
        cards.add(new SetCardInfo("Myriad Landscape", 487, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Najeela, the Blade-Blossom", 514, Rarity.MYTHIC, mage.cards.n.NajeelaTheBladeBlossom.class));
        cards.add(new SetCardInfo("Natural Reclamation", 245, Rarity.COMMON, mage.cards.n.NaturalReclamation.class));
        cards.add(new SetCardInfo("Necrotic Hex", 137, Rarity.RARE, mage.cards.n.NecroticHex.class));
        cards.add(new SetCardInfo("Nekusar, the Mindrazer", 529, Rarity.MYTHIC, mage.cards.n.NekusarTheMindrazer.class));
        cards.add(new SetCardInfo("Nightshade Harvester", 138, Rarity.RARE, mage.cards.n.NightshadeHarvester.class));
        cards.add(new SetCardInfo("Ninth Bridge Patrol", 33, Rarity.COMMON, mage.cards.n.NinthBridgePatrol.class));
        cards.add(new SetCardInfo("Noxious Dragon", 139, Rarity.UNCOMMON, mage.cards.n.NoxiousDragon.class));
        cards.add(new SetCardInfo("Null Caller", 140, Rarity.UNCOMMON, mage.cards.n.NullCaller.class));
        cards.add(new SetCardInfo("Numa, Joraga Chieftain", 246, Rarity.UNCOMMON, mage.cards.n.NumaJoragaChieftain.class));
        cards.add(new SetCardInfo("Nymris, Oona's Trickster", 288, Rarity.RARE, mage.cards.n.NymrisOonasTrickster.class));
        cards.add(new SetCardInfo("Obeka, Brute Chronologist", 289, Rarity.RARE, mage.cards.o.ObekaBruteChronologist.class));
        cards.add(new SetCardInfo("Omenspeaker", 83, Rarity.COMMON, mage.cards.o.Omenspeaker.class));
        cards.add(new SetCardInfo("Path of Ancestry", 353, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Patron of the Valiant", 37, Rarity.UNCOMMON, mage.cards.p.PatronOfTheValiant.class));
        cards.add(new SetCardInfo("Perilous Myr", 330, Rarity.COMMON, mage.cards.p.PerilousMyr.class));
        cards.add(new SetCardInfo("Phyrexian Rager", 142, Rarity.COMMON, mage.cards.p.PhyrexianRager.class));
        cards.add(new SetCardInfo("Phyrexian Triniform", 331, Rarity.MYTHIC, mage.cards.p.PhyrexianTriniform.class));
        cards.add(new SetCardInfo("Plague Reaver", 143, Rarity.RARE, mage.cards.p.PlagueReaver.class));
        cards.add(new SetCardInfo("Port Razer", 193, Rarity.MYTHIC, mage.cards.p.PortRazer.class));
        cards.add(new SetCardInfo("Prava of the Steel Legion", 38, Rarity.UNCOMMON, mage.cards.p.PravaOfTheSteelLegion.class));
        cards.add(new SetCardInfo("Preordain", 84, Rarity.COMMON, mage.cards.p.Preordain.class));
        cards.add(new SetCardInfo("Profane Transfusion", 145, Rarity.MYTHIC, mage.cards.p.ProfaneTransfusion.class));
        cards.add(new SetCardInfo("Prophetic Prism", 334, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Prossh, Skyraider of Kher", 530, Rarity.MYTHIC, mage.cards.p.ProsshSkyraiderOfKher.class));
        cards.add(new SetCardInfo("Prying Eyes", 86, Rarity.COMMON, mage.cards.p.PryingEyes.class));
        cards.add(new SetCardInfo("Queen Marchesa", 531, Rarity.MYTHIC, mage.cards.q.QueenMarchesa.class));
        cards.add(new SetCardInfo("Radiant, Serra Archangel", 40, Rarity.UNCOMMON, mage.cards.r.RadiantSerraArchangel.class));
        cards.add(new SetCardInfo("Raise the Alarm", 41, Rarity.COMMON, mage.cards.r.RaiseTheAlarm.class));
        cards.add(new SetCardInfo("Rakdos, Lord of Riots", 532, Rarity.MYTHIC, mage.cards.r.RakdosLordOfRiots.class));
        cards.add(new SetCardInfo("Rakshasa Debaser", 146, Rarity.RARE, mage.cards.r.RakshasaDebaser.class));
        cards.add(new SetCardInfo("Ramos, Dragon Engine", 545, Rarity.MYTHIC, mage.cards.r.RamosDragonEngine.class));
        cards.add(new SetCardInfo("Ravos, Soultender", 533, Rarity.MYTHIC, mage.cards.r.RavosSoultender.class));
        cards.add(new SetCardInfo("Rebbec, Architect of Ascension", 42, Rarity.UNCOMMON, mage.cards.r.RebbecArchitectOfAscension.class));
        cards.add(new SetCardInfo("Rejuvenating Springs", 354, Rarity.RARE, mage.cards.r.RejuvenatingSprings.class));
        cards.add(new SetCardInfo("Reliquary Tower", 488, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Reshape the Earth", 683, Rarity.MYTHIC, mage.cards.r.ReshapeTheEarth.class));
        cards.add(new SetCardInfo("Return to Dust", 43, Rarity.UNCOMMON, mage.cards.r.ReturnToDust.class));
        cards.add(new SetCardInfo("Rings of Brighthearth", 335, Rarity.RARE, mage.cards.r.RingsOfBrighthearth.class));
        cards.add(new SetCardInfo("Rograkh, Son of Rohgahh", 197, Rarity.UNCOMMON, mage.cards.r.RograkhSonOfRohgahh.class));
        cards.add(new SetCardInfo("Run Away Together", 87, Rarity.COMMON, mage.cards.r.RunAwayTogether.class));
        cards.add(new SetCardInfo("Sandstone Oracle", 336, Rarity.UNCOMMON, mage.cards.s.SandstoneOracle.class));
        cards.add(new SetCardInfo("Sanitarium Skeleton", 148, Rarity.COMMON, mage.cards.s.SanitariumSkeleton.class));
        cards.add(new SetCardInfo("Scholar of the Ages", 93, Rarity.UNCOMMON, mage.cards.s.ScholarOfTheAges.class));
        cards.add(new SetCardInfo("Scroll Rack", 337, Rarity.MYTHIC, mage.cards.s.ScrollRack.class));
        cards.add(new SetCardInfo("Sengir, the Dark Baron", 149, Rarity.RARE, mage.cards.s.SengirTheDarkBaron.class));
        cards.add(new SetCardInfo("Seraphic Greatsword", 45, Rarity.MYTHIC, mage.cards.s.SeraphicGreatsword.class));
        cards.add(new SetCardInfo("Siani, Eye of the Storm", 95, Rarity.UNCOMMON, mage.cards.s.SianiEyeOfTheStorm.class));
        cards.add(new SetCardInfo("Sidar Kondo of Jamuraa", 535, Rarity.MYTHIC, mage.cards.s.SidarKondoOfJamuraa.class));
        cards.add(new SetCardInfo("Sifter Wurm", 254, Rarity.UNCOMMON, mage.cards.s.SifterWurm.class));
        cards.add(new SetCardInfo("Silas Renn, Seeker Adept", 536, Rarity.MYTHIC, mage.cards.s.SilasRennSeekerAdept.class));
        cards.add(new SetCardInfo("Siren Stormtamer", 96, Rarity.UNCOMMON, mage.cards.s.SirenStormtamer.class));
        cards.add(new SetCardInfo("Sky Diamond", 341, Rarity.COMMON, mage.cards.s.SkyDiamond.class));
        cards.add(new SetCardInfo("Slash the Ranks", 47, Rarity.RARE, mage.cards.s.SlashTheRanks.class));
        cards.add(new SetCardInfo("Soul's Fire", 200, Rarity.COMMON, mage.cards.s.SoulsFire.class));
        cards.add(new SetCardInfo("Soul's Might", 257, Rarity.COMMON, mage.cards.s.SoulsMight.class));
        cards.add(new SetCardInfo("Spark Harvest", 150, Rarity.COMMON, mage.cards.s.SparkHarvest.class));
        cards.add(new SetCardInfo("Spectator Seating", 356, Rarity.RARE, mage.cards.s.SpectatorSeating.class));
        cards.add(new SetCardInfo("Staff of Domination", 343, Rarity.RARE, mage.cards.s.StaffOfDomination.class));
        cards.add(new SetCardInfo("Staunch Throneguard", 344, Rarity.COMMON, mage.cards.s.StaunchThroneguard.class));
        cards.add(new SetCardInfo("Supreme Will", 102, Rarity.UNCOMMON, mage.cards.s.SupremeWill.class));
        cards.add(new SetCardInfo("Sweet-Gum Recluse", 260, Rarity.RARE, mage.cards.s.SweetGumRecluse.class));
        cards.add(new SetCardInfo("Swiftfoot Boots", 474, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Szat's Will", 152, Rarity.RARE, mage.cards.s.SzatsWill.class));
        cards.add(new SetCardInfo("Tana, the Bloodsower", 537, Rarity.MYTHIC, mage.cards.t.TanaTheBloodsower.class));
        cards.add(new SetCardInfo("Tevesh Szat, Doom of Fools", 153, Rarity.MYTHIC, mage.cards.t.TeveshSzatDoomOfFools.class));
        cards.add(new SetCardInfo("Thalisse, Reverent Medium", 291, Rarity.UNCOMMON, mage.cards.t.ThalisseReverentMedium.class));
        cards.add(new SetCardInfo("Thorn of the Black Rose", 154, Rarity.COMMON, mage.cards.t.ThornOfTheBlackRose.class));
        cards.add(new SetCardInfo("Thought Vessel", 346, Rarity.UNCOMMON, mage.cards.t.ThoughtVessel.class));
        cards.add(new SetCardInfo("Thrasios, Triton Hero", 538, Rarity.MYTHIC, mage.cards.t.ThrasiosTritonHero.class));
        cards.add(new SetCardInfo("Three Visits", 261, Rarity.UNCOMMON, mage.cards.t.ThreeVisits.class));
        cards.add(new SetCardInfo("Tormod, the Desecrator", 155, Rarity.UNCOMMON, mage.cards.t.TormodTheDesecrator.class));
        cards.add(new SetCardInfo("Training Center", 358, Rarity.RARE, mage.cards.t.TrainingCenter.class));
        cards.add(new SetCardInfo("Tymna the Weaver", 539, Rarity.MYTHIC, mage.cards.t.TymnaTheWeaver.class));
        cards.add(new SetCardInfo("Undergrowth Stadium", 359, Rarity.RARE, mage.cards.u.UndergrowthStadium.class));
        cards.add(new SetCardInfo("Valakut Invoker", 206, Rarity.COMMON, mage.cards.v.ValakutInvoker.class));
        cards.add(new SetCardInfo("Vampiric Tutor", 156, Rarity.MYTHIC, mage.cards.v.VampiricTutor.class));
        cards.add(new SetCardInfo("Vault of Champions", 360, Rarity.RARE, mage.cards.v.VaultOfChampions.class));
        cards.add(new SetCardInfo("Vial Smasher the Fierce", 540, Rarity.MYTHIC, mage.cards.v.VialSmasherTheFierce.class));
        cards.add(new SetCardInfo("Victimize", 157, Rarity.UNCOMMON, mage.cards.v.Victimize.class));
        cards.add(new SetCardInfo("Vow of Duty", 54, Rarity.UNCOMMON, mage.cards.v.VowOfDuty.class));
        cards.add(new SetCardInfo("Vow of Flight", 105, Rarity.UNCOMMON, mage.cards.v.VowOfFlight.class));
        cards.add(new SetCardInfo("Vow of Lightning", 209, Rarity.UNCOMMON, mage.cards.v.VowOfLightning.class));
        cards.add(new SetCardInfo("Vow of Torment", 159, Rarity.UNCOMMON, mage.cards.v.VowOfTorment.class));
        cards.add(new SetCardInfo("Vow of Wildness", 262, Rarity.UNCOMMON, mage.cards.v.VowOfWildness.class));
        cards.add(new SetCardInfo("War Room", 361, Rarity.RARE, mage.cards.w.WarRoom.class));
        cards.add(new SetCardInfo("Warden of Evos Isle", 106, Rarity.UNCOMMON, mage.cards.w.WardenOfEvosIsle.class));
        cards.add(new SetCardInfo("Wild Celebrants", 212, Rarity.COMMON, mage.cards.w.WildCelebrants.class));
        cards.add(new SetCardInfo("Wildheart Invoker", 263, Rarity.COMMON, mage.cards.w.WildheartInvoker.class));
        cards.add(new SetCardInfo("Wrong Turn", 107, Rarity.RARE, mage.cards.w.WrongTurn.class));
        cards.add(new SetCardInfo("Xenagos, God of Revels", 541, Rarity.MYTHIC, mage.cards.x.XenagosGodOfRevels.class));
        cards.add(new SetCardInfo("Zur the Enchanter", 544, Rarity.MYTHIC, mage.cards.z.ZurTheEnchanter.class));
    }
}
