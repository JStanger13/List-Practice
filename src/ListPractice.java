
public class ListPractice {
	
	public static void main(String[] args) {
		intStack temp = new intStack();
		
		temp.push(5);
		temp.push(10);
		temp.push(30);
		temp.push(4);
		temp.push(85);
		temp.printStack();
		System.out.print("\nSize = " + temp.getSize());
		System.out.println("\nYou just popped " + temp.pop());
		System.out.println("\nYou just popped " + temp.pop());
		System.out.println("\nYou just popped " + temp.pop());
		temp.printStack();

		System.out.println("\nYou just popped " + temp.pop());
		System.out.println("\nYou just popped " + temp.pop());
		System.out.println("\nYou just popped " + temp.pop());
		temp.printStack();
		
		System.out.print("\nSize = " + temp.getSize());
	}
	
}
	




