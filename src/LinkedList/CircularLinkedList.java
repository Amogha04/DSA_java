package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.size = 0;
    }

    public void insertEndorStart(int value){
        Node node = new Node(value);
        if(head == null){
           head = node;
           tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        while (temp != tail){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print(temp.value);
        System.out.println();
    }

    public int delete(int position){
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        int value;
        value = temp.next.value;
        temp.next = temp.next.next;
        return value;
    }


    public class Node{
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
