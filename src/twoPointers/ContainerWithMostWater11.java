package twoPointers;

public class ContainerWithMostWater11 {
    private int maxArea(int [] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            int containerLength = right-left;
            int area = containerLength*Math.min(height[left],height[right]);
            res = Math.max(res,area);
            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater11 solution = new ContainerWithMostWater11();
        System.out.println("max are :"+solution.maxArea(height));
    }
}
