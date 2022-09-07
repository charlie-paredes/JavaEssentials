import java.util.Queue;
import java.util.LinkedList;
/*in a Queue, the first element to go in is the first element out.
  for example, in the real world, the first page inserted in a printer
  is the first page out. */
public class QueueBasics {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));
            //adds three people to the queue

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
            //shows the person at the front of the queue
        System.out.println(supermarket.poll());
            //shows the person at front of the queue and removes them
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    static record Person(String name, int age){
    }
}
