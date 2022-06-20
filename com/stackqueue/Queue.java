package com.stackqueue;

import java.util.LinkedList;

public class Queue {
    //initializing linked list
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    public static void main(String[] args) {
        System.out.println("welcome to queue");

        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }

    //adding enque method
    public void enqueue(Integer data) {
        linkedList.addLast(data);
    }

    //adding dequeue method
    public void dequeue() {
        linkedList.removeFirst();
    }

    //printing queue
    public void printQueue() {
        System.out.println(linkedList.toString());
    }
}
