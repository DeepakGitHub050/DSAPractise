/*
* You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
Find and return the maximum possible sum of the B elements that were removed after the B operations.
NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.*/
public class PickFromBothSides {
    public static void main(String[] args) {
        int[] arr ={5, -2, 3 , 1, 2};
        int b=3;
        System.out.println(solve(arr,b));
    }
    public static int solve(int[] arr, int b){
        int len=arr.length;
        int s = 0,ans=0;
        for (int i = 0; i < b; i++) {
            s+=arr[i];
        }

        int j=len-1;
        for (int i = b-1; i >=0; i--) {
            s=s-arr[i]+arr[j];
            if(s>ans)
                ans=s;
            j--;
        }
        return ans;
    }
}
