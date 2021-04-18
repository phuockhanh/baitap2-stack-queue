package com.khanh.mylinkedlist;

public class Queue<E> {
    public MyLinkedList<E> elements;
    public Queue(E e){
        elements = new MyLinkedList(e);
    }
    public void add(E e){
        elements.addLast(e);
    }
    public void remove(){
        if(elements.isEmpty()){
            System.out.println("Found");
        }
        else{
            elements.removeFirst();
        }
    }
    public E peek(){
        return (E) elements.peek();
    }
    public int size(){
        return elements.size();
    }
    public void display(){
        elements.display();
    }
}
