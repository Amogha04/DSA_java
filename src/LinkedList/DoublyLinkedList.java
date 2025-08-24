package LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void insertDoublyFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if(head != null){
            head.previous = node;
        }
        head = node;
    }

    public void insertDoublyLast(int value){
        Node node = new Node(value);
        Node temp = head;
        if(temp == null){
            insertDoublyFirst(value);
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        node.previous = temp;
    }

    public void insertDoubly(int value,int position){
        Node node = new Node(value);
        Node temp = head;
        if(position == 0){
            insertDoublyFirst(value);
        }
        if(position == size - 1){
            insertDoublyLast(value);
        }
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        temp.next.previous = node;
        node.next = temp.next;
        temp.next = node;
        node.previous = temp;
    }

    public void displayDoubly(){
        Node temp = head;
        //Node last = null;
        while (temp !=null){
            System.out.print(temp.value + "->");
           // last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
        //Displaying in reverse order
//        while (last != null){
//            System.out.print(last.value + "->");
//            last = last.previous;
//        }
//        System.out.print("START");
    }

    public class Node{
        private Node next;
        private Node previous;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, Node previous, int value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }
    }
}
