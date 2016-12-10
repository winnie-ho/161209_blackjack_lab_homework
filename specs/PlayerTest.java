import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;

public class PlayerTest {

  Player player;
  Hand hand;
  Card card1;
  Card card2;
  
  @Before 
  public void before() {
    hand = new Hand();
    player = new Player("Tegan", hand);
    card1 = new Card(SuitType.DIAMONDS, ValueType.TWO);
    card2 = new Card(SuitType.DIAMONDS, ValueType.FOUR);

  }

  @Test
  public void hasName() {
    assertEquals("Tegan", player.getName());
  }

  @Test
  public void hasHand(){
    assertNotNull(hand);
  }

  @Test
  public void hasCardInHand() {
    hand.addDealtCardToHand(card1);
    assertEquals(1, player.handSize());
  }


}