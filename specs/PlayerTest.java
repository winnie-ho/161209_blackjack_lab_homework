import static org.junit.Assert.*;
import org.junit.*;

import blackJackManagement.*;

public class PlayerTest {

  Player player;

  
  @Before 
  public void before() {
    player = new Player("Tegan");

  }

  @Test
  public void hasName() {
    assertEquals("Tegan", player.getName());
  }

  
}