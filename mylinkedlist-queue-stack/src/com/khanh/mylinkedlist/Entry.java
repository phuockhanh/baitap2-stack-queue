package com.khanh.mylinkedlist;

public class Entry {
    public static void main(String[] args) {
//        Queue<Integer> queue = new Queue<>(10);
//        queue.add(5);
//        queue.add(10);
//        queue.add(15);
//        queue.add(20);
//        queue.add(25);
//        System.out.println("Peek: "+queue.peek());
//        System.out.println("size: "+queue.size());
//        queue.display();
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.display();
        System.out.println("===================");
        stack.pop();
        System.out.println("Search: "+stack.search(20));
        stack.display();
    }
}
