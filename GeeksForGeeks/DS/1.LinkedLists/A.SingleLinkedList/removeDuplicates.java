package geeksforgeeks;

public class removeDuplicates {
	public static void main(String[] args) {
		operations obj = new operations();
		obj.insertAtEnd(1);
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		Node cur = obj.head;
//		System.out.println(cur.data);
		while(cur!=null && cur.next!=null) {
			Node next = cur.next;
			if(cur.data == next.data) {
//				System.out.println("came");
				next = next.next;
				cur.next = next;
			}
			else {
				cur = cur.next;
			}
		}
		obj.printList(obj.head);

	}

}
