package practice;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    final PriorityQueue<Integer> heap = new PriorityQueue<>();
    final int k;
    public KthLargestElementInAStream(int k, int [] nums) {
        this.k = k;
        for (int n: nums) {
           add(n);
        }
    }
    public int add(int val) {
        if (heap.size() < k) {
           heap.offer(val);
        } else if (val> heap.peek()) {
            heap.poll();
            heap.add(val);
        }
        return heap.peek();
    }
}
