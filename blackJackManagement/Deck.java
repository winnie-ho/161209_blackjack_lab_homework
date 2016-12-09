package blackJackManagement;
import java.util.*;

public class Deck{
  private ArrayList<Card>packOfCards;

  public void Deck(){
    this.packOfCards = new ArrayList<Card>();
  }

  public void createDeck(){
    for (SuitType suit : SuitType.values()){
      for (ValueType value : ValueType.values()){
        packOfCards.add(new Card (suit, value));
      }
    }
  }



  // public void createDeck(){
  //   for (int i = 0; i < 4; i++){
  //     for (ValueType value : ValueType.value()){
  //       packofCards.add(new Card (i, ValueType));
  //     }
  //   }
  // }
// populate deck with nested loop through suit, then value to create 52 cards.
}
}

