import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;

public class PlayerTest {

  Player player;
  Hand hand;
  Card card;
  
  @Before 
  public void before() {
    hand = new Hand();
    player = new Player("Tegan", hand);
    card = new Card(SuitType.DIAMONDS, ValueType.TWO);
  }

  @Test
  public void hasName() {
    assertEquals("Tegan", player.getName());
  }

  @Test
  public void hasCardInHand() {
    hand.addDealtCardToHand(card);
    assertEquals(1, player.handSize());
  }


}