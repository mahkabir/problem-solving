import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//sorted array hole two pointer use krbo, tokhn space complexity O(n) thakbena
    public  int [] twoSumMethod(int [] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){    // time complexity O(n), space complexity worse case O(n) for map,  map.contains,map.put time complexity O(1)
            int num = nums[i];
            int diff = target - num;
            if(map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(num,i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        TwoSum solution = new TwoSum();
        int [] result = solution.twoSumMethod(arr,target);
        System.out.println("indices are : "+ Arrays.toString(result));

    }
}
