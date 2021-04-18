package com.khanh.mylinkedlist;

public class MyLinkedList<E> {
    public Node head;
    public int numberNodes=0;
    public MyLinkedList(E data){
        head = new Node(data);
        numberNodes++;
    }
    public void addLast(E data){
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        numberNodes++;
    }
    public void addFirst(E data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numberNodes++;
    }
    public E removeLast(){
        Node temp = head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        E var = (E) temp.next.data;
        temp.next = null;
        numberNodes--;
        return (E) var;
    }
    public E peek(){
        return (E) head.data;
    }
    public E removeFirst(){
        Node temp = head;
        E var = (E) head.data;
        head = temp.next;
        temp.next = null;
        numberNodes--;
        return var;
    }
    public int size(){
        return numberNodes;
    }
    public boolean isEmpty(){
        return (numberNodes==0);
    }
    public int search(E data){
        Node temp = head;
        int count=-1;
        for(int i=0;i<numberNodes;i++){
            if(temp.data == data){
                count=i;
                break;
            }
            temp = temp.next;
        }
        return  count;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
