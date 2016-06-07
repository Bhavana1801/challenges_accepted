package geeksforgeeks;

public class deleteAlternate {
	public static void main(String[] args) {
		operations obj = new operations();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.insertAtEnd(5);
		
		//implementation
		Node prev = obj.head;
		Node cur = prev.next;
		while(prev != null && cur != null) {
			prev.next = cur.next;
			cur = null;
			prev = prev.next;
			if(prev != null)
				cur = prev.next;
		}
		obj.printList(obj.head);
	}
}
