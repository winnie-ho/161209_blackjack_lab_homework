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
}