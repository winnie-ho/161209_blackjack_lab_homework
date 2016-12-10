package blackJackManagement;
import java.util.*;

public class Deck{
  private ArrayList<Card> packOfCards;

  public Deck(){
    this.packOfCards = new ArrayList<Card>();
  }

  public void createDeck(){
    for (SuitType suit : SuitType.values()){
      for (ValueType value : ValueType.values()){
        packOfCards.add(new Card(suit, value));
      }
    }
  }

  public int sizeOfDeck(){
    return packOfCards.size();
  }

  public void printDeck() {
    for (Card card : packOfCards){
      System.out.println(card.getValue() + " (" +card.getValueInteger() + ") of " + card.getSuit());
    }
  }

  public void shuffleDeck(){
    Collections.shuffle(packOfCards);
  }

  public void deal(){
    Card dealtCard = packOfCards.remove(0);

  }

}


