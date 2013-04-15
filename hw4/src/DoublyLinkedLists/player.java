package DoublyLinkedLists;

public class player {
	String name="";
	int score=0;
	hand handh= new hand();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public hand getHandh() {
		return handh;
	}

	public void setHandh(hand handh) {
		this.handh = handh;
	}

	public player(String name){
		this.name= name;
	}
}
