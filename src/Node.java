
public class Node {
	int data;
	Node next;
	Node previous;
	
	
	Node(){
		data = 0;
		next = null;
	}
	
	Node(int i){
		data = i;
		next = null;
	}
	
	public Node(int addData, Node addNext){
		data = addData;
		next = addNext;
	}

}
