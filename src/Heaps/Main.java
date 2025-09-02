package Heaps;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap heap = new Heap(5);
        heap.insert(10);
        heap.insert(90);
        heap.insert(23);
        heap.insert(20);
        heap.insert(30);

        heap.printHeap();

        System.out.println(heap.remove());
        System.out.println(heap.remove());

        heap.printHeap();
        System.out.println(heap.peek());
    }
}
