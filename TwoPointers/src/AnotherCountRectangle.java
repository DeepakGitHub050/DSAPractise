public class AnotherCountRectangle {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int B = 10;
        System.out.println(solve(A,B));
    }
    static int solve(int[] arr,int b){
        int c=0;
        int n=arr.length;
        int p1=0,p2=n-1;
        while (p1<n && p2>=0){
            int area = arr[p1]*arr[p2];
            if(area<b){
                c+=(p2+1);
                p1++;
            }
            else
                p2--;
        }
        return c;
    }
}
