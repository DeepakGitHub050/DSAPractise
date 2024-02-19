import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
An element is a leader if it is strictly greater than all the elements to its right side.*/
public class LeadersInAnArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(16, 17, 4, 3, 5, 2);
        System.out.println(solve(arr));
    }
    public static List<Integer> solve(List<Integer> l){
        int len = l.size();
        List<Integer> res = new ArrayList<>();
        res.add(l.getLast());
        int max=l.getLast();

        for (int i = len-2; i >= 0; i--) {
            if(l.get(i)>max){
                max=l.get(i);
                res.add(max);
            }
        }
        return res;
    }
}
