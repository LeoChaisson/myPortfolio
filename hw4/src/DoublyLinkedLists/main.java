package DoublyLinkedLists;

import java.util.Scanner;
public class main {

	public static void main(String[] args){
		int numOfPlayers;
		deck deck1 = new deck();
		deck1.generateDeck();
		deck1.shuffle();
		System.out.println("How many players?");
		Scanner keyboard = new Scanner(System.in);
		numOfPlayers = keyboard.nextInt();
		LinkedList<player> players = new LinkedList<player>();
		for(int i=0; i<numOfPlayers; i++){
			player p;
			p = new player(""+(i+1));
			players.add(p);
		}
		for(int i = 0; i<numOfPlayers; i++) {
			deck1.deal(players.get(i).getHandh());
		}
		for(int i = 0; i<numOfPlayers; i++) {
			deck1.deal(players.get(i).getHandh());
		}
		int tempPlayers = numOfPlayers;
		String temp;
		char response;
		for(int i=0;i<numOfPlayers;i++){
			int n = 0;
			while(n!=1){
				System.out.println("tempPlayers: " + tempPlayers);
				System.out.println("Player " + i + ": ");
				System.out.println("Press s to show your hand");
				System.out.println("Press h to hit (recieve another card)");
				System.out.println("Press w to hold (recieve no more cards)");
				temp = keyboard.next();
				response = temp.charAt(0);
				switch(response) {
				case 's':
					System.out.println("Hand: " + players.get(i).getHandh().toString());
					break;
				case 'h':
					System.out.println(deck1.get(0));
					deck1.deal(players.get(i).getHandh());
					break;
				case 'w':
					n=1;
					break;
				}
			}
		}
		for(int i=0; i<numOfPlayers;i++){
			int total = 0;
			hand temph;
			temph = players.get(i).getHandh();
			for(int k=0; k<temph.size(); k++){
				total += temph.get(k).getValue();
			}
			if(total> 21)
			System.out.println("Player "+ i + ": went bust!");
			else
			System.out.println("Player "+ i + ": " +total);
		}
		

	}
}
