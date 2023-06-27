
public class SLL {
	
	public Node head;
	public Node next;
	
	
//	CONSTRUCTOR
	public SLL(Node head, Node next) {
		this.head = null;
		this.next = null;
	}
	
	
	public void add(int val) {
		Node newNode = new Node(val);
		
		//check if SLL is empty
		if(this.head == null) {			
			this.head = newNode;
		} else {
			System.out.println("pass");
		}
	}

}
