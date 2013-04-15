package DoublyLinkedLists;

import java.util.Random;



public class deck extends Pile{
	deck() {
		super();
	}
	public void generateDeck() {
		add(new card("Ace",11, suit.Spades));
		add(new card("Ace",11, suit.Clubs));
		add(new card("Ace",11, suit.Hearts));
		add(new card("Ace",11, suit.Diamonds));
		add(new card("King",10, suit.Spades));
		add(new card("King",10, suit.Clubs));
		add(new card("King",10, suit.Hearts));
		add(new card("King",10, suit.Diamonds));
		add(new card("Queen",10, suit.Spades));
		add(new card("Queen",10, suit.Clubs));
		add(new card("Queen",10, suit.Hearts));
		add(new card("Queen",10, suit.Diamonds));
		add(new card("Jack",10, suit.Spades));
		add(new card("Jack",10, suit.Clubs));
		add(new card("Jack",10, suit.Hearts));
		add(new card("Jack",10, suit.Diamonds));
		for(int i = 2; i <= 10; i++) {
			for (suit s : suit.values())
				add(new card(""+i,i,s));
		}


	}

	public void deal(hand handh){
		handh.add(this.get(0));
		this.remove(this.get(0));
	}
	public void shuffle() {
		int size = this.size();
		for (int i=0; i<size*10; i++) {
			int randNum = (int) (Math.random() * size);
			System.out.println("Random Number: " + randNum);
			card c = this.get(randNum);
			System.out.println("Random Card: " + c.toString());
			this.remove(this.get(randNum));
			this.add(c);
			size--;
		}
	}



}
