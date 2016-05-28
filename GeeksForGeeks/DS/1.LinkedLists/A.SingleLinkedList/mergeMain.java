class mergeMain {
	public static void main(String[] args) {
		operations obj = new operations();
		obj.insertAtEnd(10);
		obj.insertAtEnd(5);
		obj.insertAtEnd(20);
		obj.insertAtEnd(2);
		obj.insertAtEnd(1);
		obj.printList(obj.head);
		mergeSort obj1 = new mergeSort();
		obj1.mergeSortAlgo(obj.head);
	}
}
class mergeSort {
	public void mergeSortAlgo(Node head) {
		if(head == null || head.next == null)
			return;
		Node start = head;
		Node end = head.next;
		while()
	}
}