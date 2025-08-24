package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
         head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void insert(int value,int position){
        if(position == 0){
            insertFirst(value);
            return;
        }
        if (position == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
        return value;
    }

    public int deleteLast(){
        if(size == 1){
            deleteFirst();
        }
        Node temp = head;
        for (int i = 1; i < size - 1 ; i++) {
            temp = temp.next;
        }
        tail = temp;
        int value = temp.next.value;
        tail.next = null;

        return value;
    }

    public int delete(int position){
        int value;
        if(position == 1){
            deleteFirst();
        }
        if(position == size - 1){
            deleteLast();
        }
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        value = temp.next.value;
        temp.next = temp.next.next;

        return value;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 1;i < index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node( int value ,Node next) {
            this.next = next;
            this.value = value;
        }
    }
}
