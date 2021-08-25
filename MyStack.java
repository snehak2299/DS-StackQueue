package com.bridglab.stack;

public class MyStack <K>{
	public INode<K> head;
    public INode<K> tail;
    
    public MyStack() {
		
		this.head = null;
		this.tail = null;
	}

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
    public void peek(){ // find peek of stack
    	if(head!=null) {
    		System.out.println(this.head.getKey());
    	     pop();
    	}    
    }

    public void pop(){ //pop till stack is empty
    	if(head!=null) {
    		 System.out.println("after poping the peek of stack " + head.getKey());
    		 this.head=this.head.getNext();
    		 printList();
    		 peek();
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
