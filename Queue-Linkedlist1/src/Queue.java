import java.util.LinkedList;

public class Queue<E> {
    LinkedList<E> queue;
    public Queue(){
        queue = new LinkedList<>();
    }
    public void add(E e){
        if(queue.isEmpty()){
            queue.addFirst(e);
        }
        else{
            queue.addLast(e);
        }
    }
    public E pool(){
        if(queue.isEmpty()){
            System.out.println("Found");
            return null;
        }
        else{
            return (E) queue.removeLast();
        }
    }
    public int search(E e){
        return queue.indexOf(e);
    }
    public String toString(){
        return queue.toString();
    }
}
