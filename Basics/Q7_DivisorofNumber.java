package Basics;
import java.util.List;
import java.util.ArrayList;
public class Q7_DivisorofNumber {
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i * i <= n; i++){ //instead of looping from 1 to n, run a loop from 1 to sqrt(n)
            if(n%i==0){
                al.add(i);
            }
        }
        return al;
    }
}