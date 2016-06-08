package geeksforgeeks;

public class pairWiseSwap {
	public static void main(String[] args) {
		operations obj = new operations();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(4);
		obj.insertAtEnd(5);
		Node temp = obj.head;
		while(temp != null && temp.next != null) {
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
		obj.printList(obj.head);
//		recSwap rec = new recSwap();
//		rec.swapNodes(obj.head);
//		obj.printList(obj.head);
		
	}
}
class recSwap {
	void swapNodes(Node head) {
		if(head != null && head.next != null) {	
			swap(head.data, head.next.data);
			swapNodes(head.next.next);
		}
	}
	void swap(int node1, int node2) {
		int temp;
		temp = node2;
		node2 = node1;
		node1 = temp;
	}
}
