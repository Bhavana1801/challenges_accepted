package geeksforgeeks;

public class removeDuplicatesSorted {
	public static void main(String args[]) {
		operations obj = new operations();
		obj.insertAtEnd(11);
		obj.insertAtEnd(13);
		obj.insertAtEnd(11);
		obj.insertAtEnd(14);
		obj.insertAtEnd(15);
		obj.insertAtEnd(11);
		Node ptr1 = obj.head;
		Node ptr2 = null,dup=null;
		while(ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			
			while(ptr2.next != null) {
				
//				System.out.println(ptr1.data + " "+ ptr2.next.data);
				
				if(ptr1.data == ptr2.next.data) {
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
//					System.gc();
				} else {
					ptr2 = ptr2.next;
				}
			}
			
			ptr1 = ptr1.next;
//			System.out.println("list\n");
//			obj.printList(obj.head);
		}
//		System.out.println("see");
		obj.printList(obj.head);
	}
}
