import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;

public class DeckTest {
  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
    deck.createDeck();
  }

  @Test
  public void deckIsComplete() {
    assertEquals(52, deck.sizeOfDeck());
  }

  @Test
  public void printOutAllDeck() {
    deck.printDeck();
  }

  @Test
  public void deckRemovesACardUponDeal() {
    deck.deal();
    assertEquals(51, deck.sizeOfDeck());
  }

  @Test
  public void deckCanShuffle() {
    System.out.println("-----");
    deck.shuffleDeck();
    deck.printDeck();
  }

}