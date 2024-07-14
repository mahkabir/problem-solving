public class BinarySearch1 {

    // Java implementation of iterative Binary Search
        // Returns index of x if it is present in arr[l....r], else return -1
       /* int binarySearch(int arr[], int l, int r, int x)
        {
            while (l <= r) {
                int mid = (l + r) / 2;

                // If the element is present at the
                // middle itself
                if (arr[mid] == x) {
                    return mid;

                    // If element is smaller than mid, then
                    // it can only be present in left subarray
                    // so we decrease our r pointer to mid - 1
                } else if (arr[mid] > x) {
                    r = mid - 1;

                    // Else the element can only be present
                    // in right subarray
                    // so we increase our l pointer to mid + 1
                } else {
                    l = mid + 1;
                }
            }

            // We reach here when element is not present
            // in array
            return -1;
        }*/
        int binarySearch(int  arr [], int left, int right, int traget){
            while (left<=right){
                int mid = (left+right)/2;
                if(arr[mid]==traget)
                    return mid;
                else if (arr[mid]>traget)
                    right = mid-1;
                else left = mid+1;
            }
            return -1;
        }        // Driver method to test above


        public static void main(String args[])
        {
            BinarySearch1 ob = new BinarySearch1();

            int arr[] = { 2, 3, 4, 10, 40 };
            int n = arr.length;
            int x = 11;
            int result = ob.binarySearch(arr, 0, n - 1, x);

            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index "
                        + result);
        }

        int binary_search(int A[], int n, int x){
            int l,r,mid;
            l =0;
            r = n-1;
            while(l<=r){
                mid = (l+r)/2;
                if(A[mid]==x){
                    return mid;
                }
                if(A[mid]<x){
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
            return -1;
        }
    }


