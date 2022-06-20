package com.stackqueue;

import java.util.LinkedList;

public class Stack {
    //inititalizizng linked list
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    public static void main(String[] args) {
        System.out.println("welcome to stack and queue");

        //creating object of stack class
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.peek();
        stack.pop();
        stack.printStack();
    }

    //adding first method
    public void push(Integer data) {
        linkedList.addFirst(data);
    }

    //adding peek method
    public void peek() {
        System.out.println(linkedList.peek());
    }

    //adding pop method till stack is empty
    public void pop() {
        while (linkedList.size() != 0) {
            linkedList.pop();
        }
    }

    //printing list
    public void printStack() {
        System.out.println(linkedList.toString());
    }
}
