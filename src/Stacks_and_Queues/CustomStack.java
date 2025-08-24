package Stacks_and_Queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
       return ptr == -1;
    }

    public int peek() throws StackExeception{
       if(isEmpty()){
           throw new StackExeception("Cannot peek from empty Stack!!");
       }
       return data[ptr];
    }

    public int pop() throws StackExeception {
      if (isEmpty()){
          throw new StackExeception("Cannot pop from empty stack!!");
      }
      return data[ptr--];
    }

    public boolean push(int num) throws StackExeception{
      if (isFull()){
          throw new StackExeception("Stack is full , cannot push!!");
      }
      ptr++;
      data[ptr] = num;
      return true;
    }

}
