
public class Entry {
    public static void main(String[] args) {
        MyGenericStack<Integer> stack1 = new MyGenericStack<>();
        stack1.push(5);
        stack1.push(10);
        stack1.push(15);
        stack1.push(20);
        stack1.push(25);
        stack1.pop();
        System.out.println(stack1.toString());
    }
}
