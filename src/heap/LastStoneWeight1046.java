package heap;

import java.util.PriorityQueue;

public class LastStoneWeight1046 {

    private int findLastStoneWeight(int [] arr){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int n: arr) {
            maxHeap.add((-n));
        }
        while(maxHeap.size()>1){
            int largeStone = maxHeap.remove();
            int smallStone = maxHeap.remove();
            if(largeStone!=smallStone){
                maxHeap.add(largeStone-smallStone);
            }
        }
        return maxHeap.size()!=0? (-maxHeap.remove()):0;
    }
    public static void main(String[] args) {
        int [] arr = {2,7,4,1,8,1};
        LastStoneWeight1046 sln = new LastStoneWeight1046();
        System.out.println("last stone weight: "+sln.findLastStoneWeight(arr));
    }
}
