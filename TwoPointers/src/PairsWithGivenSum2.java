public class PairsWithGivenSum2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6,6,8};
        int B = 4;
        System.out.println(solve(arr,B));
    }
    static int solve(int[] A, int B){
        long count = 0;
        int n=A.length;
        int p1=0,p2=n-1;
        int mod = 1000000007;
        while(p1<p2) {
            if(A[p1]+A[p2]==B)
            {
                if (A[p1] == A[p2]) {
                    int freq = p2 - p1 + 1;
                    count = (count + ((long) freq * (freq - 1) / 2)) % mod;
                    break;
                }
                else {
                    int left = 1, right = 1;
                    while (p1 + left <= p2 && A[p1 + left] == A[p1]) {
                        left++;
                    }
                    while (p2 - right >= p1 && A[p2 - right] == A[p2]) {
                        right++;
                    }
                    count = (count + ((long) left * right) % mod) % mod;
                    p1 += left;
                    p2 -= right;
                }
            } else if (A[p1]+A[p2]<B) {
                p1++;
            }
            else {
                p2--;
            }
        }

        return (int)count;
    }
}
