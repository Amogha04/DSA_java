package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(0);
//        list.insertFirst(-3);
//        list.insertFirst(90);
//        list.insertFirst(-98);
//        list.insertLast(100);
//        list.insert(200,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertDoublyFirst(3);
//        list.insertDoublyFirst(2);
//        list.insertDoublyFirst(5);
//        list.insertDoublyFirst(-9);
//        list.displayDoubly();
//
//        list.insertDoublyLast(5);
//        list.displayDoubly();
//
//        list.insertDoubly(9,2);
//        list.displayDoubly();
        CircularLinkedList list = new CircularLinkedList();
        list.insertEndorStart(4);
        list.insertEndorStart(5);
        list.insertEndorStart(0);
        list.insertEndorStart(1);
        list.insertEndorStart(-8);
        list.display();
        list.delete(3);
        list.display();
        list.delete(0);
        list.display();
    }
}
