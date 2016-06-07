package geeksforgeeks;

public class palindrome {
	public static void main(String[] args) {
		operations obj = new operations();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(2);
		obj.insertAtEnd(1);
		Node middle = obj.middleElement();
		Node secStart = middle.next;
		middle.next = null;
		Node rev = obj.reverse(secStart);
		Node temp1 = obj.head;
		Node temp2 = rev;
		boolean flag = true;
		while(temp1!=null && temp2!=null) {
			if(temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
		
	}
	
}