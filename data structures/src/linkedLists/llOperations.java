package linkedLists;

//output= 10 20 30
//operations
public class llOperations {
	public static void main(String[] args) {
		int a = 10, b=20, c=30;
		operations obj = new operations();
		obj.insertAtEnd(100);
		
		obj.insertAtEnd(200);
		obj.insertAtEnd(300);
		obj.insertAtEnd(400);
		operations obj1 = new operations();
		obj1.insertAtEnd(10);
		
		obj1.insertAtEnd(20);
		obj1.insertAtEnd(250);
		obj1.insertAtEnd(450);
		// System.out.println("nth element from last");
		// obj.elementNfromLast(4);
		// System.out.println("nth element from last-2");
		// obj.elementNfromLast2(3);
		// System.out.println("\nreverse");
		// obj.reverse(obj.head);
		// obj.makeLoop();
		// obj.detectLoop();
		// System.out.println("\n merging two lists\n");
		// Node res = obj.merge(obj.head,obj1.head);
		// obj.printList(res);
		// System.out.println("\n merging Sort\n");
		// Node res = obj.mergeRec2(obj.head,obj1.head);
		System.out.println("sorted insert");
		Node node;
		node = obj.sortedInsert(obj1.head,node= new Node(30));
		obj.printList(node);
		System.out.println();
		obj.printList(obj.head);
		System.out.println();
		obj.deleteNode(200);
	}
}
class operations {
	Node head;
	Node head1;
	Node result;
	// static int count = 1;
	operations() {
		head = null;
		result = null;
	}
	public void insertAtEnd(int data) {
		Node node = new Node(data);
		//for the first element
		if(head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
		
	}
	public void delete(int num) {
		if(head.data == num) {
			head = head.next;
			return;
		}
		Node prev = head;
		Node cur = prev.next;
		while(cur.data != num) {
			prev = cur;
			cur = cur.next;
			if(cur==null) {
				return;
			}
		}
		prev.next = cur.next;
		cur = null;

	}
	public void printList(Node head) {
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
			if(count == 10) {
				return;
			}
			count++;
		}
	}
	public void print(Node temp) {
		System.out.println(temp.data);
	}
	public boolean search(int num) {
		Node cur = head;
		while(cur!=null) {
			if(cur.data == num) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}
	public boolean searchRec(Node head,int num) {
		if(head == null)
			return false;
		if(head.data == num) {
			return true;
		}
		return searchRec(head.next,num);
	}
	public boolean swap(int x,int y) {
		if(x == y){
			return false;
		}
		Node prevX = null,curX = head;
		while(curX!=null && curX.data != x) {
			prevX = curX;
			curX = curX.next;
		}
		// print(prevX);
		Node prevY = null,curY = head;
		while(curY!=null && curY.data != y) {
			prevY = curY;
			curY = curY.next;
		}
		// print(prevY);
		//one or two elements are not present 
		if(curX == null || curY == null) {
			return false;
		}
		//if X is head
		if(prevX == null) {
			//making y as head
			head = curY;
		}
		else {
			//linking prev and cur pointers, if we dont do this, then we cant traverse the whole list.
			prevX.next = curY;
		}
		//if y is head
		if(prevY == null) {
			head = curX;
		}
		else {
			prevY.next = curX;
		}
		//now swapping is performed.
		Node temp = curX.next;
		curX.next = curY.next;
		curY.next = temp;
		return false;

	}
	public int getNthNode(int n) {
		int count = 0;
		Node node = head;

		while(node!=null) {
			count++;
			if(count == n) {
				return node.data;
			}
			node = node.next;
		}
		return -1;

	}
	public Node middleElement() {
		Node temp1 = head;
		Node temp2 = head;
		/*move temp1 by 1 step and temp2 by 2 steps, 
		by the end of the loop, temp1 will be the middle element. */
		while(temp2 != null && temp2.next != null) {
			temp1 = temp1.next;
			temp2 = temp2.next.next;
		}
		// System.out.println(temp1.data);
		return temp1;
	}
	public void middleElement2(Node node) {
		int count = 0;
		Node mid = node;
		while(node!=null) {
			if(count%2 == 1) {
				mid = mid.next;
			}
			count++;
			node = node.next;
		}
		System.out.println(mid.data);
	}
	public void elementNfromLast(int n) {
		int len = 0;
		Node node = head;
		while(node!=null) {
			len++;
			node = node.next;
		}
		int pos = len-n+1;
		int element = getNthNode(pos);
		System.out.println(element);
	}
	public void elementNfromLast2(int n) {
		int count = 0;
		Node ref = head;
		Node main = head;
		// System.out.println("count "+count+" ref "+ref.data);
		while(count < n) {
			if(ref == null) {
				System.out.println("false");
			}
			
			
			ref = ref.next;
			count++;
			// System.out.println("count "+count+" ref "+ref.data);
		}
		// we will make n shifts from head node.
		while(ref !=null) {
			// System.out.println("d "+ref.data);
			ref = ref.next;
			main = main.next;
		}
		//ref will become null after the while loop.
		System.out.println(main.data);
	}
	public Node reverse(Node node) {
      Node prev = null;
      Node curr = node;
      Node next = null;
      //we will make every next of a node point to its previous.
      while(curr != null) {
      	// printList(curr);
      	// System.out.println();
      	next = curr.next;
      	curr.next = prev;
      	prev = curr;
      	curr = next;

      }
      head = prev;
      // printList(head);
      return head;
  }
  public void makeLoop() {

  }
  public void detectLoop() {
  	head1 = new Node(10);
  	Node node1 = new Node(20);
  	Node node2 = new Node(30);
  	Node node3 = new Node(40);
  	Node node4 = new Node(50);
  	//10 20 30 40 50 30 40 50
  	head1.next = node1;
  	node1.next = node2;
  	node2.next = node3;
  	node3.next = node4;
  	// node4.next = null;
  	node4.next = node2;
  	Node temp1 = head1;
  	Node temp2 = head1;
  	boolean flag = false;
  	// System.out.println("loop is\n");
  	// printList(head);
  	while(temp2!=null && temp2.next!=null) {
  		temp1 = temp1.next;
  		temp2 = temp2.next.next;
  		// System.out.println("temp1"+temp1.data+" temp2 "+temp2.data);
  		if(temp1 == temp2) {
  			System.out.println("found loop");
  			// System.out.println(temp1.data);
  			flag = true;
  			break;
  		}

  	}
  	System.out.println("no loop");
  	if(flag == true)
  	detectLoopStart(head,temp1);
  	removeLoop(head,temp1);
  }
  public void detectLoopStart(Node head,Node temp1) {
  	Node temp2 = temp1;
  	int size = 1;
  	temp2 = temp2.next;
  	//finding loop size
  	while(temp2 != temp1) {
  		temp2 = temp2.next;
  		size++;
  	}
  	temp1 = temp2 = head;
  	int count = 0;
  	//moving temp2 loopsize times
  	while(count < size) {
  		temp2 = temp2.next;
  		count++;
  	}
  	//finding the first meet point
  	while(temp1 != null && temp2 != null) {
  		if(temp1 == temp2) break;
  		else {
  			temp1 = temp1.next;
  			temp2 = temp2.next;
  		}
  	}

  	System.out.println("first loop found at "+temp1.data);
  }
  public void removeLoop(Node head,Node temp1) {
  	Node temp2 = temp1;
  	int size = 1;
  	temp2 = temp2.next;
  	//finding loop size
  	while(temp2 != temp1) {
  		temp2 = temp2.next;
  		size++;
  	}
  	temp1 = temp2 = head;
  	int count = 0;
  	//moving temp2 loopsize times
  	while(count < size) {
  		temp2 = temp2.next;
  		count++;
  	}
  	//finding the first meet point
  	while(temp1 != null && temp2 != null) {
  		if(temp1.next == temp2.next){
  			temp2.next = null;
  		}
  		else {
  			temp1 = temp1.next;
  			temp2 = temp2.next;
  		}
  	}
  	System.out.println("hello");
  	printList(head);
  	// System.out.println("first loop found at "+temp1.data);
  }
  public Node mergeRec(Node first, Node second) {
  	if(first==null)
  		return second;
  	if(second == null)
  		return first;
  	System.out.println("first "+first.data+" second "+second.data);
  	if(first.data <= second.data) {
  		first.next = merge(first.next,second);
  		return first;
  	}
  	else {
  		second.next = merge(first,second.next);
  		return second;
  	}
  }
  public Node merge(Node first, Node second) {
  	Node head=null;
  	if(first == null)
  		return second;
  	if(second == null)
  		return first;
  	//creating head for the new node is done.
  	if(first.data <= second.data) {
  		head = first;
  		first = first.next;
  	}
  	else {
  		head = second;
  		second = second.next;
  	}
  	Node current = head;
  	while((first!=null)||(second != null)) {
  		if(first == null) {
  			current.next = second;
  			break;
  		}	
  		else if(second == null) {
  			current.next = first;
  			break;
  		}
  		if(first.data <= second.data) {
  			current.next = first;
  			current = current.next;
  			first = first.next;
  		}
  		else {
  			current.next = second;
  			current = current.next;
  			second= second.next;
  		}

  	}
  	return head;
  }
  public Node mergeRec2(Node list1, Node list2) {
  	Node result = null;
		//base cases
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		if(list1.data <= list2.data){
			result = list1;
			result.next = mergeRec(list1.next,list2);
		}
		else {
			result = list2;
			result.next = mergeRec(list1,list2.next);
		}
		return result;
	}
	public Node sortedInsert(Node head,Node list) {
		// Node node = new Node(data);
		Node current = head;
		if(head == null || head.data >= list.data) {
			list.next = head;
			head = list;
			// System.out.println("came");
			return head;
		}
		while(current.next != null) {
			if(current.next.data < list.data) {
				current = current.next;
			}
			else {
				Node next = current.next;
				current.next = list;
				list.next = next;
				break;
			}
		}
		return head;
	}
	public void deleteNode(int data) {
		Node cur = head;
		boolean flag = false;
		if(cur.data == data) {
			head = head.next;
			flag = true;
		}
		while(cur.next != null) {
			// System.out.println("cur "+cur.data);
			if(cur.next.data == data) {
				cur.next = cur.next.next;
				flag = true;
				break;
			} else {
				cur = cur.next;
			}
		}
		if(flag == true) {
			printList(head);
		} else {
			System.out.println("element not found");
		}
	}
}
