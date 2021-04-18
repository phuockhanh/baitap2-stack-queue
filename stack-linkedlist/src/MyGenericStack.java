import java.util.LinkedList;

public class MyGenericStack<E> {
    public LinkedList<E> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(E e){
        stack.addLast(e);
    }
    public E pop(){
        if(isEmpty()){
            System.out.println("found");
            return null;
        }
        else{
            stack.removeFirst();
            return (E) stack;
        }
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
       return (stack.size()==0);
    }
    public String toString(){
        return stack.toString();
    }
}
