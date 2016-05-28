class removeDuplicates {
	public static void main(String[] args) {
		operations obj = new operations();
		obj.insertAtEnd(1);
		obj.insertAtEnd(2);
		obj.insertAtEnd(3);
		obj.insertAtEnd(2);
		obj.insertAtEnd(1);
		Node cur = obj.head;
		System.out.println(cur.data);

	}
}