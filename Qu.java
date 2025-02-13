package Queue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Qu {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person(" Chris", 34));
        linkedList.add(new Person(" Alex", 25));
        linkedList.add(new Person(" Mike", 25));
        ListIterator<Person> personalIterator = linkedList.listIterator();
        while(personalIterator.hasNext()){
            System.out.println(personalIterator.next());
        }
        System.out.println();

        while(personalIterator.hasPrevious()){
            System.out.println(personalIterator.previous());
        }
//        supermarket.add(new Person(" Merry", 12));
//        supermarket.add(new Person(" Lee", 67));

//        System.out.println(supermarket.size());
//        System.out.println(supermarket.peek());
//        System.out.println(supermarket.poll());
//        System.out.println(supermarket.size());
//        System.out.println(supermarket.peek());


    }

    static record Person(String name, int age){

    }
}
