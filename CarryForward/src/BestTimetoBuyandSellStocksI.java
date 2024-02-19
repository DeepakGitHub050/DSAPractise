/*
* Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
* design an algorithm to find the maximum profit.
Return the maximum possible profit.*/
public class BestTimetoBuyandSellStocksI {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 4};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        int len = arr.length;
        int max=arr[0];
        int min = arr[0];

        for (int i = 1; i < len; i++) {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min){
                min=arr[i];
                max=arr[i];
            }
        }
        return max-min;
    }
}
