package heap;

public class ExtractMaxPriorityQueue {
    public int extractMax(int [] heap, int heapSize){
     MaxHeap maxHeap = new MaxHeap();
     maxHeap.buildMaxHeap(heap,heapSize);
     int maxItem = heap[0];
      heap[1] = heap[heapSize-1];
      heapSize-= 1;
      maxHeap.maxHeapify(heap,heapSize-1,0);
      return maxItem;
    }
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 1, 4, 5};
        MaxHeap maxHeap = new MaxHeap();
        ExtractMaxPriorityQueue extractMaxPriorityQueue = new ExtractMaxPriorityQueue();
        System.out.println("max item from priority queue is: "+extractMaxPriorityQueue.extractMax(arr,arr.length));
    }
}
