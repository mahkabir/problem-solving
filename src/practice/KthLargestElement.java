package practice;

import heap.KthLargestElementInArry;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {
        KthLargestElement solution = new KthLargestElement();

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = solution.findKthLargest(nums, k);
        System.out.println("The " + k + "-th largest element is: " + kthLargest);
        int[] nums2 = {7, 10, 4, 3, 20, 15};
        k = 3;
        kthLargest = solution.findKthLargest(nums2, k);
        System.out.println("The " + k + "-th largest element is: " + kthLargest);
    }

    private int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int n : nums){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }

        }return heap.peek();
    }
}
