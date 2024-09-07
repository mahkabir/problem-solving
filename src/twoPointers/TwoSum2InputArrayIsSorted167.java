package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum2InputArrayIsSorted167 {
    private int [] findTargetIndexes(int [] arr,int target){
        int left = 0;
        int right = arr.length-1;
        int firstValue;
        int secondValue;
        while(left<right){
            firstValue = arr[left];
            secondValue = arr[right];
            if(firstValue+secondValue==target)
                break;
            if(firstValue+secondValue<target){
                left++;
                continue;
            }
            right--;
        }
        return new int[] {left,right};
        /*for (; left < right; ) {
           firstValue = arr[left];
           secondValue = arr[right];

            if (firstValue + secondValue == target) {
                return new int[]{left + 1, right + 1};  // Adjusting for 1-based index
            }

            if (firstValue + secondValue < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no solution is found, return an indication, like {-1, -1}
        return new int[]{-1, -1};*/
    }

    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 18;
        TwoSum2InputArrayIsSorted167 solution = new TwoSum2InputArrayIsSorted167();
        int [] result = solution.findTargetIndexes(arr,target);
        System.out.println("target indexes are: "+Arrays.toString(result));
    }
}
