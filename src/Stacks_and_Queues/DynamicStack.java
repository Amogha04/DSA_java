package Stacks_and_Queues;

public class DynamicStack extends CustomStack{
    public DynamicStack(int size) {
        super(size);
    }

    public DynamicStack() {
        super();
    }

    @Override
    public boolean push(int num) throws StackExeception {
        if (isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(num);
    }
}
