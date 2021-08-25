package com.bridglab.stack;

public class MyStack <K>{
	public INode<K> head;
    public INode<K> tail;

  //  public MyStack() {

  //  }

    public void push(INode<K> newNode)
    {
        add(newNode);
    }

    public void add(INode<K> newNode) { // method to add nodes
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void printList() {  // method for printing nodes
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
