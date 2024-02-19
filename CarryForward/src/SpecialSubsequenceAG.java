/*
* You have given a string A having Uppercase English letters.
  You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
* */
public class SpecialSubsequenceAG {
    public static void main(String[] args) {
        System.out.println(solution("AKJGAkG"));
    }
    public static int solution(String str){
        int ans=0,count=0;
        int l=str.length();
        for (int i = l-1; i >=0; i--) {
            if(str.charAt(i)=='G')
                count++;
            if(str.charAt(i)=='A')
                ans+=count;
        }
        return ans;
    }
}
