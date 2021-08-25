package com.bridglab.stack;

public class MyQueueRunner {
	public static void main(String[] args) {
		MyNode<Integer> firstNode=new MyNode<>(56);
        MyNode<Integer> secondNode=new MyNode<>(30);
        MyNode<Integer> thirdNode=new MyNode<>(70);
        MyQueue myQueue=new MyQueue();
        myQueue.enQueue(firstNode);
        myQueue.enQueue(secondNode);
        myQueue.enQueue(thirdNode);
        System.out.println("my queue");
        myQueue.printQueue();
	}

}
