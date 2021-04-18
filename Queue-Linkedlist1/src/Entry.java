public class Entry {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.add(20);
        queue.add(25);
        queue.pool();
        System.out.println(queue.search(10));
        System.out.println(queue.toString());
    }
}
