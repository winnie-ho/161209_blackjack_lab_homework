import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;

public class HandTest {

  Player player;
  Hand hand;
  Card card1; 
  Card card2; 

  @Before
  public void before(){
    hand = new Hand();
    card1 = new Card (SuitType.CLUBS, ValueType.FIVE);
    card2 = new Card (SuitType.CLUBS, ValueType.FOUR);
    player = new Player ("Winnie", hand);
  }




  @Test
  public void getValueOfHand() {
    hand.addDealtCardToHand(card1);
    hand.addDealtCardToHand(card2);
    assertEquals(9, hand.valueOfHand());
    
    // hand.valueOfHand();
    // System.out.println(card1.getValueInteger());
    // System.out.println(card2.getValueInteger());
  }
}