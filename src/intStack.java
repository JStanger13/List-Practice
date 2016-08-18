public class intStack {
	
	intList stack;


	intStack(){
		stack = new intList();
	}
	
	
	public void push(int userStackIn){
		stack.addFront(userStackIn);
		
	}
	public int pop(){
		return stack.popFront();
	}
	
	public void printStack(){
		stack.printList();
	}	

	public int getSize(){
		return stack.getSize();
	}
}




	
