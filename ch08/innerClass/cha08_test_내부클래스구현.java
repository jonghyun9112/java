package com.ruby.java.ch08.innerClass;


public class cha08_test_내부클래스구현 {
	private Node head;
	public cha08_test_내부클래스구현() {
		head = null;
	}
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
			this.link = null;
		}
	}
	public void add(String data) {
		Node temp = new Node(data);
		Node p = head;
		Node q = null;
		while (p != null) {
			q = p ;
			p = p.link;
		}
		q.link = temp;
		if (p == null ) {
			head = p; 
			return;
		}

	}
	public void printList() {
		//printList() 결과는 A -> B -> C 등으로 출력한다
	}
	public void delete(String data) {

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cha08_test_내부클래스구현 myList = new cha08_test_내부클래스구현();
		myList.printList();

		myList.add("JAVA");
		myList.add("HTML");
		myList.add("CSS");
		myList.add("Javascript");
		myList.printList();
		myList.delete("CSS");
		myList.printList();
	}

}
