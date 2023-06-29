
public class SLL {
	
	public Node head;
	
	
//	CONSTRUCTOR
	public SLL() {
		this.head = null;
	}
	
	
	public void add(int val) {
		Node newNode = new Node(val);
		
		//check if SLL is empty
		if(this.head == null) {			
			this.head = newNode;
		} else {
			Node runner = this.head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	
	public void removeFront() {
		//proceed if SLL is not empty
		if(this.head != null) {
			Node runner = this.head;
			if(runner.next != null) {
				this.head = runner.next;
			} else {
				this.head = null;
			}
		}
	}

}
