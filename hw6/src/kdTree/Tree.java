package kdTree;


public class Tree {

}
class Node{

	Node left;
	Node right;
	Node parent;
	int x,y;

	
	public Node(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setData(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void insertData(int x, int y){
		if(getHeight() % 2 == 0)
		{
		if(x < this.x){
			if(left == null){
				left = new Node(x,y);
				left.parent = this;
			}
			else{
				left.insertData(x,y);
			}
		}
		else {
			if (right == null) {
				right = new Node(x,y);
				right.parent = this;
			}
			else {
				right.insertData(x,y);
			}
		}
		}
		else {
			if(y < this.y){
				if(left == null){
					left = new Node(x,y);
					left.parent = this;
				}
				else{
					left.insertData(x,y);
				}
			}
			else {
				if (right == null) {
					right = new Node(x,y);
					right.parent = this;
				}
				else {
					right.insertData(x,y);
				}
			}
		}
	}
	public int getx(){
		return this.x;
	}
	public int gety(){
		return this.y;
	}
	public int getHeight(){
		if(parent!=null){
			return parent.getHeight()+1;
		}
		else 
			return 0;
	}
	@Override
	public String toString(){
		String s = new String();
		for(int i = 0; i<getHeight(); i++) {
			s += "    ";
		}
		s+= getx() + "," + gety();
		return s;
	}
	public static void output(Node node) {
		System.out.println(node);
		if(node.left !=null) {
			System.out.println("Left: " + node.getHeight());
			output(node.left);
		}
		if (node.right !=null) {
			System.out.println("Right: " + node.getHeight());
			output(node.right);
		}
	}
	public static void main(String[] args) {
		Node x = new Node(1,2);
		x.insertData(5, 10);
		x.insertData(10, 15);
		x.insertData(7, 3);
		x.insertData(13, 20);
		x.insertData(4, 1);
		output(x);
	}
}

