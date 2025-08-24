package Stacks_and_Queues;

public class Main {
    public static void main(String[] args) throws StackExeception {
//        CustomStack stack = new DynamicStack(8);
//
//        stack.push(34);
//        stack.push(67);
//        stack.push(90);
//        stack.push(12);
//        stack.push(56);
//        stack.push(0);
//        stack.push(-3);
//        stack.push(66);
//        stack.push(9);
//        stack.push(-3);
//        stack.push(66);
//        stack.push(9);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(0);
        queue.insert(6);
        queue.insert(7);
        queue.insert(2);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.insert(78);

        queue.display();



    }
}
