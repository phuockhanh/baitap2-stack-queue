import java.util.Arrays;

public class MyQueue<E> {
    public static final int  CAPACITY=10;
    public E[] queueArr;
    public int currentSize=0;
    public MyQueue(){
        queueArr = (E[]) new Object[CAPACITY];
    }
    public void cansuCapa(){
        int newSize = queueArr.length*2;
        queueArr = Arrays.copyOf(queueArr,newSize);
    }
    public boolean isQueueFull(){
        return (currentSize>=queueArr.length);
    }
    public boolean isQueueEmpty(){
        return (currentSize==0);
    }
    public void enqueue(E e){
        if(currentSize==queueArr.length){
            cansuCapa();
        }
        queueArr[currentSize] = e;
        currentSize++;
    }
    public E dequeue(){
        return sort1(queueArr);
    }
    public E sort1(E[] queueArr){
        E tam = queueArr[0];
        for(int i=0;i<currentSize-1;i++){
            queueArr[i] = queueArr[i+1];
        }
        currentSize--;
        return tam;
    }
    public void display(){
        for(int i=0;i<currentSize;i++){
                System.out.print(queueArr[i]+" ");
        }
        System.out.println();
    }
}
