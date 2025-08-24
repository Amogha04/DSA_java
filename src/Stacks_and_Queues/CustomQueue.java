package Stacks_and_Queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public void insert(int item) throws StackExeception {
        if(isFull()){
           throw new StackExeception("The queue is full!!");
        }
        data[end++] = item;
    }

    public boolean isFull(){
        return data.length == end;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public int remove() throws StackExeception{
        if(isEmpty()){
            throw new StackExeception("The queue is empty!!");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws StackExeception {
        if(isEmpty()){
            throw new StackExeception("The queue is empty!!");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}
