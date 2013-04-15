package DoublyLinkedLists;

public class card {
private String face;
private int value;
private suit suit;

public card(String face, int value, suit suit) {
	this.suit = suit;
	this.face = face;
	this.value = value;
}
public String getFace() {
	return face;
}
public int getValue() {
	return value;
}
public suit getSuit() {
	return suit;
}
public String toString(){
	String s="[Suit:" + suit + " Face:" + face + " Value:" + value + "]";
	return s;
}
}
