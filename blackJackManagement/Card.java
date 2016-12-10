package blackJackManagement;

public class Card{
  private SuitType suit;
  private ValueType value;

  public Card ( SuitType suit, ValueType value){
    this.suit = suit;
    this.value = value;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public ValueType getValue(){
    return this.value;
  }

  public int getValueInteger(){
    if 
      (value.ordinal() <= 9){
    return value.ordinal()+1;
  }
  else{
      return 10;
  }
  }

  public void printCard(){
  System.out.println(this.value + " of " + this.suit);
  }
}