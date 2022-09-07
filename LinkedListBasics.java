import java.util.LinkedList;
import java.util.ListIterator;
/*Linked Lists are like Queues with more functionality.
  This is because it is able to access which elements of the structure
  are next, and which ones are previous. */

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList();
            //creates new linked list called linked list
            //with objects of the Person type

        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Mariam", 20));
        linkedList.addFirst(new Person("Khabib", 40));
            //adds elements to the linked list

        ListIterator<Person> personListIterator
                = linkedList.listIterator();
            //creates a list iterator using our linked list
            //allows us to traverse the list in either direction

        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
            //prints the linked list in normal order

        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
            //prints the linked list in reverse order
        }
    }
    static record Person(String name, int age){
    }
}
