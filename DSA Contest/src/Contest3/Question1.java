package Contest3;

import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        int[] A = {17,-24,87,86,-19,37,1,-97};
        System.out.println(solve(A,19));
    }
    public static int solve(int[] A, int B) {
        HashMap<Integer,Integer> hsm = new HashMap<>();
        int ans =0;
        int sum =0;
        hsm.put(0,-1);
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
            int b = sum - B;
            if(hsm.containsKey(b))
            {
                int f = hsm.get(b);
                int len = i-f;
                ans = Math.max(len,ans);
            }
            if(!hsm.containsKey(sum))
                hsm.put(sum,i);
        }
        return ans;
    }
}
