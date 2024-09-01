package heap;

import java.util.Map;

public class FindKthLargestElementFromRaw3 {

    public int findKthLargestELement(int [] heap, int heapSize,int k){
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.buildMaxHeap(heap,heapSize);
        for(int i =0;i<=k-2;i++){
            int max = heap[0];
            heap[0] = heap[heapSize-1];
            heap[heapSize-1] = max;
            heapSize-=1;
            maxHeap.maxHeapify(heap, heapSize,0);
        }
        int kthLargestElement = heap[0];
        return  kthLargestElement;
    }
    public static void main(String[] args) {
        int [] arr = {3, 9, 2, 1, 4, 5};
        int k =2;
        FindKthLargestElementFromRaw3 findKthLargestElementFromRaw3 = new FindKthLargestElementFromRaw3();
        System.out.println("Kth largest element is :"+findKthLargestElementFromRaw3.findKthLargestELement(arr, arr.length,k));
    }
}
