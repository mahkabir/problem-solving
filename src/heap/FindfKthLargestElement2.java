package heap;

public class FindfKthLargestElement2 {
    static class MinHeap {
        private int[] heap;
        private int size;
        private int capacity;

        // Constructor
        public MinHeap(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.heap = new int[capacity + 1]; // 1-indexed array for easier math
        }

        // Method to get the parent index
        private int parent(int i) { return i / 2; }

        // Method to get the left child index
        private int leftChild(int i) { return 2 * i; }

        // Method to get the right child index
        private int rightChild(int i) { return 2 * i + 1; }

        // Method to insert an element into the heap
        public void insert(int element) {
            if (size == capacity) {
                // Heap is full, cannot insert
                return;
            }

            // Insert the new element at the end
            size++;
            heap[size] = element;

            // Heapify-up to maintain the heap property
            int current = size;
            while (current > 1 && heap[current] < heap[parent(current)]) {
                swap(current, parent(current));
                current = parent(current);
            }
        }

        // Method to remove the root element (minimum element)
        public int removeRoot() {
            if (size == 0) {
                return Integer.MAX_VALUE; // Heap is empty
            }

            int root = heap[1];
            heap[1] = heap[size];
            size--;

            // Heapify-down to maintain the heap property
            heapify(1);

            return root;
        }

        // Method to get the root element (minimum element)
        public int getRoot() {
            if (size == 0) {
                return Integer.MAX_VALUE; // Heap is empty
            }
            return heap[1];
        }

        // Method to maintain the min-heap property
        private void heapify(int i) {
            int left = leftChild(i);
            int right = rightChild(i);
            int smallest = i;

            if (left <= size && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right <= size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != i) {
                swap(i, smallest);
                heapify(smallest);
            }
        }

        // Method to swap two elements in the heap
        private void swap(int a, int b) {
            int temp = heap[a];
            heap[a] = heap[b];
            heap[b] = temp;
        }
    }

    public static class Solution {

        // Method to find the k-th largest element using a custom min-heap
        public int findKthLargest(int[] nums, int k) {
            MinHeap minHeap = new MinHeap(k);

            // Iterate over the array
            for (int n : nums) {
                if (minHeap.size < k) {
                    // If the heap is not full, insert the element
                    minHeap.insert(n);
                } else if (n > minHeap.getRoot()) {
                    // If the heap is full and the current element is larger than the root,
                    // replace the root with the current element
                    minHeap.removeRoot();
                    minHeap.insert(n);
                }
            }

            // The root of the heap is the k-th largest element
            return minHeap.getRoot();
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

            // Example array
            int[] nums = {3, 2, 1, 5, 6, 4};

            // Example: Find the 2nd largest element
            int k = 2;
            int kthLargest = solution.findKthLargest(nums, k);

            // Output the result
            System.out.println("The " + k + "-th largest element is: " + kthLargest);

            // Another example
            int[] nums2 = {7, 10, 4, 3, 20, 15};
            k = 3;
            kthLargest = solution.findKthLargest(nums2, k);

            // Output the result
            System.out.println("The " + k + "-th largest element is: " + kthLargest);
        }
    }

}
