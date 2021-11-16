package com.company;

public class Card {
    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX,SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

        public static Value getValues(int index) {
            Value[] values = Value.values();
            return values[index];
        }

        public static int getValueLength() {
            return Value.values().length;
        }
    }

    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES;

        public static Suit getSuits(int index){
            Suit[] suits = Suit.values();
            return suits[index];
        }

        public static int getSuitLength() {
            return Suit.values().length;
        }
    }

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue() {
        return this.value;
    }

    public String toString(){
        return this.value + " of " + this.suit;
    }
}

