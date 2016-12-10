package blackJackManagement;
import java.util.*;

public class Hand{

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }


  public ArrayList getHand(){
    return this.hand;
  }

  public void addDealtCardToHand(Card dealtCard){
    hand.add(dealtCard);
    System.out.println("Card added to hand is " + dealtCard.getValue() + " of " + dealtCard.getSuit());
  }


  public int valueOfHand(){
    int count = 0;
    for (Card card : hand) {
      count = count + card.getValueInteger();
      }
    return count;
  }


}