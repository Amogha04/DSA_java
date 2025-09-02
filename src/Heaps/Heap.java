package Heaps;

public class Heap {
    private int size;
    private int[] heap;
    private int capacity;

    Heap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int i){
        return (i - 1) / 2;
    }

    private int leftChild(int i){
        return 2 * i + 1;
    }

    private int rightChild(int i){
        return 2 * i + 2;
    }

    private void swap(int i,int j){
        int temp;
        temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int element){
        if(size == capacity){
            System.out.println("Heap is full");
            return;
        }
        heap[size] = element;
        size++;
        int current = size - 1;

        while (current > 0 && heap[parent(current)] < heap[current]){
            swap(parent(current),current);
            current = parent(current);
        }
    }

    public int remove() throws Exception{
        if(size <= 0){
            throw new Exception("Heap is empty!");
        }
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return root;
    }

    private void heapify(int index){
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if(left < size && heap[largest] < heap[left]){
            largest = left;
        }
        if(right < size && heap[largest] < heap[right]){
            largest = right;
        }
        if(largest != index){
            swap(largest,index);
            heapify(largest);
        }
    }

    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public int peek() throws Exception{
        if(size <= 0){
            throw new Exception("Heap is empty!");
        }
        return heap[0];
    }
}
