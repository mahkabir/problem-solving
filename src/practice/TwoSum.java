package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private int [] findIndices(int [] arr,int target){
        Map<Integer,Integer> map =  new HashMap<>()  ;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int diff =  target-num;
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(num,i);

        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int [] result = twoSum.findIndices(arr,target);
        System.out.println("indices are : "+ Arrays.toString(result));
    }
}
