package heap;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    public static class KthLargest {

        final PriorityQueue<Integer> heap = new PriorityQueue<>();
        final int k;

        // Constructor initializes the KthLargest object with 'k' and an initial stream of numbers
        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (int n : nums) {
                add(n); // Add each number from the array
            }
        }

        // Add a new number to the heap and return the k-th largest element
        public int add(int val) {
            if (heap.size() < k) {
                heap.offer(val); // Add the value to the heap if its size is less than k
            } else if (val > heap.peek()) {
                heap.poll(); // Remove the smallest element (top of the heap)
                heap.add(val); // Add the new value
            }
            return heap.peek(); // The k-th largest element (top of the heap)
        }
    }

    // Main method to demonstrate the KthLargest class
    public static void main(String[] args) {
        int k = 3; // We want to find the 3rd largest element
        int[] nums = {4, 5, 8, 2}; // Initial stream of numbers

        // Initialize the KthLargest object
        KthLargest kthLargest = new KthLargest(k, nums);

        // Add elements and print the k-th largest element after each addition
        System.out.println(kthLargest.add(3));  // Output: 4
        System.out.println(kthLargest.add(5));  // Output: 5
        System.out.println(kthLargest.add(10)); // Output: 5
        System.out.println(kthLargest.add(9));  // Output: 8
        System.out.println(kthLargest.add(4));  // Output: 8
    }
}