public class intList {
	Node Head;
	Node Tail;
	int size;
	
	intList(){
		Tail = new Node();
		Head = new Node();
		size = 0;
	}

	public void addFront(int userIn){
		Node userNode = new Node(userIn, Head.next);
		Head.next = userNode;
		if(size == 0){
			Tail.next = userNode;
		}
		size++;
	}
	
	public void printList(){
		Node myNode = Head.next;
		while(myNode != null){
			System.out.print(myNode.data + " ");
			myNode = myNode.next;
		}
		System.out.println();
	}
	
		public void addBack(int userBackIn){
			Node userBackNode = new Node(userBackIn);
			
			if(size == 0){
				Head.next = userBackNode;
			}else{
				Tail.next.next = userBackNode;
			}
			Tail.next = userBackNode;
			size++;
	}
		
		public int getSize(){
			return size;
		}
	
	//popFront() - removes AND returns the first node's value (front)
		public int popFront(){
			int x;
			if (size > 0){
			x = Head.next.data;
			Head.next = Head.next.next; 
			size--;
			}else{
				Tail.next = null;
				System.out.println("There are no more numbers in the stack!");
				 x = 0;
			}
			return x;
			
		}

}