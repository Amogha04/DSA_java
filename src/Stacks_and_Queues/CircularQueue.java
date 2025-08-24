package Stacks_and_Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = 0;
    private int front = 0;
    private int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return data.length == 0;
    }
    public void insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!");
            return;
        }
        data[end++] = item;
        end %= data.length;
        size++;
    }
    public int remove() throws StackExeception {
        if(isEmpty()){
            throw new StackExeception("Queue is empty!!");
        }
        int removed = data[front++];
        front %= data.length;
        size--;

        return removed;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;
        }while (i != end);
        System.out.println("END");
    }
}
