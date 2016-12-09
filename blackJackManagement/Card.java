package blackJackManagement;

public class Card{
  private ValueType value;
  private SuitType suit;

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
}