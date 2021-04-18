package com.khanh.mylinkedlist;

public class Stack<E> {
    public MyLinkedList<E> stack;
    public Stack(E data){
        stack = new MyLinkedList<>(data);
    }
    public void push(E data){
        stack.addLast(data);
    }
    public E pop(){
        return stack.removeLast();
    }
    public int size(){
        return stack.size();
    }
    public int search(E data){
        return stack.search(data);
    }
    public void display(){
        stack.display();
    }
}
