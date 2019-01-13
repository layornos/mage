package mage.cards.decks.importer;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import mage.cards.decks.DeckCardInfo;
import mage.cards.decks.DeckCardLists;
import mage.cards.repository.CardInfo;

public class O8dDeckImporter extends XmlDeckImporter {

  @Override
  public DeckCardLists importDeck(String filename, StringBuilder errorMessages) {
    try {
      Document doc = getXmlDocument(filename);
      DeckCardLists decklist = new DeckCardLists();

      List<Node> mainCards = getNodes(doc, "/deck/section[@name='Main']/card");
      decklist.setCards(mainCards.stream()
          .flatMap(toDeckCardInfo(getCardLookup(), errorMessages))
          .collect(Collectors.toList()));

      List<Node> sideboardCards = getNodes(doc, "/deck/section[@name='Sideboard']/card");
      decklist.setSideboard(sideboardCards.stream()
          .flatMap(toDeckCardInfo(getCardLookup(), errorMessages))
          .collect(Collectors.toList()));

      return decklist;
    } catch (Exception e) {
      logger.error("Error loading deck", e);
      errorMessages.append("There was an error loading the deck.");
      return new DeckCardLists();
    }
  }

  private static int getQuantityFromNode(Node node) {
    Node numberNode = node.getAttributes().getNamedItem("qty");
    if (numberNode == null) {
      return 1;
    }
    try {
      return Math.min(100, Math.max(1, Integer.parseInt(numberNode.getNodeValue())));
    } catch (NumberFormatException e) {
      return 1;
    }
  }

  private static Function<Node, Stream<DeckCardInfo>> toDeckCardInfo(CardLookup lookup, StringBuilder errors) {
    return node -> {
      String name = node.getTextContent();
      Optional<CardInfo> cardInfo = lookup.lookupCardInfo(name);
      if (cardInfo.isPresent()) {
        CardInfo info = cardInfo.get();
        return Collections.nCopies(
            getQuantityFromNode(node),
            new DeckCardInfo(info.getName(), info.getCardNumber(), info.getSetCode())).stream();
      } else {
        errors.append("Could not find card: '").append(name).append("'\n");
        return Stream.empty();
      }
    };
  }

}
