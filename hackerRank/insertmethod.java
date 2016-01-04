class Node {
	int data;
	Node next;
}
class insertMethod {
	Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=null;
		if(position == 0) {
			if(head!=null) {
				newNode.next = head;
				head = newNode;
				return head;
			}
			else {
				head = newNode;
				return head;
			}
		}

		Node temp = new Node();
		temp=head;
		for(int i = 1; temp!=null;i++) {
			if(i == position) {
				newNode.next=temp.next;
				temp.next = newNode;
				return head;
			}
			temp=temp.next;
		}
		return head;
	}
}