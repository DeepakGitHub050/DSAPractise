public class ContainerWitMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3};
        System.out.println(solve(arr));
    }
    static int solve(int[] a){
        int i=0, j=a.length-1;
        int maxArea = 0;
        while(i<j){
            int area = Math.min(a[i],a[j])*(j-i);
            maxArea = Math.max(maxArea,area);

            if(a[i]<a[j])
                i++;
            else
                j--;
        }
        return maxArea;
    }
}
