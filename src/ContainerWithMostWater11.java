public class ContainerWithMostWater11 {
   public int maxArea(int [] a){
       int l =0;
       int r = a.length-1;
       int res= 0;
       while(l<r){
           int containerlength = (r-l);
           int area = containerlength*Math.min(a[l],a[r]);
           res = Math.max(res,area);
           if(a[l]<a[r]){
               l++;
           }else{
               r--;
           }
       }
       return res;
   }

    public static void main(String[] args) {
        int [] height ={1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater11 solution = new ContainerWithMostWater11();
        int reponse = solution.maxArea(height);
        System.out.println("Container with most water :"+reponse);
    }
}
