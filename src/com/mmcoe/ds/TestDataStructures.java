package com.mmcoe.ds;

public class TestDataStructures {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.insert(3,60);
		list.print();

		BinaryTree bt = new BinaryTree();
		bt.add(9);
		bt.add(20);
		bt.add(5);
		bt.add(8);
		bt.traverse();
		
		Stack<Integer> st = new Stack<Integer>(10);
		st.push(50);
		st.push(30);
		st.push(20);
		st.pop();
		st.push(45);
		st.print();
	}
}
