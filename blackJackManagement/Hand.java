package blackJackManagement;
import java.util.*;

public class Hand{

  private ArrayList<Card> cardsInHand;

  public Hand(){
    this.cardsInHand = new ArrayList<Card>();
  }


  public ArrayList getCardsInHand(){
    return this.cardsInHand;
  }

  public void addDealtCardToHand(Card dealtCard){
    cardsInHand.add(dealtCard);
  }

  public int valueOfHand(){
    
  }


}