import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before() {
    card = new Card(SuitType.SPADES, ValueType.ACE);
  }

  @Test
  public void hasSuit() {
    assertEquals(SuitType.SPADES, card.getSuit());
  }

  @Test
  public void hasValue() {
    assertEquals(ValueType.ACE, card.getValue());
  }
}