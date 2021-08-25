package com.bridglab.stack;

public class MyQueue<K> {
	private INode head;
	private INode tail;
	
	public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public void enQueue(INode myNode) {
		append(myNode);
	}
	public void deQueue()
	    {
	        this.head=this.head.getNext();
	    }
	
	public void printQueue() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode temp = this.head;
		while (temp != null) {
			printformat.append(temp.getKey());
			if ( temp != tail) {
				printformat.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(printformat);
	}

}
