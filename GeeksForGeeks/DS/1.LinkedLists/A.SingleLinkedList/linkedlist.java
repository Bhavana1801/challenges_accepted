//output= 10 20 30
class Node {
	int data;
	Node next;
	Node() {
	}
	Node(int data){
		this.data = data;
	}
	Node(int data,Node next) {
		this.data = data;
		this.next = next;
	}
}
public class linkedlist {
	public static void main(String[] args) {
		Node node2 = new Node(30);
		Node node1 = new Node(20,node2);
		Node head = new Node();
		head.data = 10;
		head.next = node1;
		printList(head);
	}
	static void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}