/*
* A wire connects N light bulbs.
Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
You can press the same switch multiple times.
Note: 0 represents the bulb is off and 1 represents the bulb is on.*/
public class TurnOnAllBulbs {
    public static void main(String[] args) {
        int[] arr={0,1,1,1};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        int len = arr.length;
        int ans=0;
        for (int i = 0; i < len; i++) {
            if(arr[i]==0 && ans%2==0)
                ans++;
            if(arr[i]==1 && ans%2!=0)
                ans++;
        }
        return ans;
    }
}
