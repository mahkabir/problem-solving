package heap;

public class MaxHeap {
    public void maxHeapify(int[] heap, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < heapSize && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < heapSize && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = heap[i];
            heap[i] = heap[largest];
            heap[largest] = swap;
            maxHeapify(heap, heapSize, largest);
        }
    }
    /*public void minHeapify(int [] heap,int heapSize, int i){
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<heapSize && heap[left] < heap[smallest]){
            smallest =left;
        }
       if(right<heapSize && heap[right] < heap[smallest]){
           smallest = right;
       }
       while(smallest!=i){
           int swap = heap[i];
           heap[i] = heap[smallest];
           heap[smallest] = heap[i];
           minHeapify(heap,heapSize,smallest);
       }
    }*/
    public void buildMaxHeap(int[] heap, int heapSize) {
        int startIdx = (heapSize / 2) - 1;
        for (int i = startIdx; i >= 0; i--) {
            maxHeapify(heap, heapSize, i);
        }
    }
    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 1, 4, 5};
        MaxHeap maxHeap = new MaxHeap();
       // maxHeap.buildMaxHeap(arr, arr.length);
       // maxHeap.heapSort(arr,arr.length);
        /*System.out.println("Max Heap array:");
        maxHeap.printArray(arr);*/
        /*System.out.println("Sorted Heap: ");
        maxHeap.printArray(arr);*/
       // maxHeap.buildMaxHeap(arr,arr.length);
        System.out.println("Min heap: ");
        maxHeap.printArray(arr);
    }

    private void heapSort(int[] heap, int heapSize) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.buildMaxHeap(heap, heapSize);
        for (int i = heapSize-1;i>0;i--){
            int t = heap[0];
            heap[0] = heap[i];
            heap[i] = t;
            heapSize = heapSize-1;
            maxHeapify(heap,heapSize,0);
        }
    }
}
