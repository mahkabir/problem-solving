package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSortedArrayWithTwoPointer {

    private int [] findIndices(int [] arr,int target){
      int left =0;
      int right = arr.length-1;
      while(left<right){
          int a = arr[left];
          int b = arr[right];
          if(a+b==target){
              break;
          }
          if(a+b<target){
              left++;
              continue;
          }
          right--;
      } return new int[] {left+1,right+1};
    }
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        TwoSumSortedArrayWithTwoPointer twoSum = new TwoSumSortedArrayWithTwoPointer();
        int [] result = twoSum.findIndices(arr,target);
        System.out.println("indices are : "+ Arrays.toString(result));
    }
}
