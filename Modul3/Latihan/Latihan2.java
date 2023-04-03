import java.util.LinkedList;
import java.util.Queue;

public class Latihan2 {

    public void QueueExample() {

    Queue queue = new LinkedList();

    queue.add("Java");
    queue.add("DotNet");
    queue.add("PHP");
    queue.add("HTML");
        System.out.println("remove  : "  + queue.remove());
        System.out.println("element : "  + queue.element());
        System.out.println("Poll    : "  + queue.poll());
        System.out.println("peek    : "  + queue.peek());
    }

    public static void main(String[] args){
        new Latihan2 () .QueueExample();
    }
}
