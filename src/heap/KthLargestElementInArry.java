package heap;

import java.util.PriorityQueue;

public class KthLargestElementInArry {
    public int findKthLargest(int[] nums, int k) {
        // Create a min heap (PriorityQueue) to store the k largest elements
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // Iterate over the array
        for (int n : nums) {
            // Add the integer to the heap
            heap.add(n);

            // If the size of the heap is greater than k
            if (heap.size() > k) {
                // Remove the root element (smallest in the heap)
                heap.poll();
            }
        }

        // The root of the heap is the k-th largest element
        return heap.peek();
    }
    public static void main(String[] args) {
        KthLargestElementInArry solution = new KthLargestElementInArry();

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
