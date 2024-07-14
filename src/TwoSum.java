import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public  int [] twoSumMethod(int [] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
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

    }
}
