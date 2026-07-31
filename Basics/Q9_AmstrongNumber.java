package Basics;
public class Q9_AmstrongNumber {
    static boolean armstrongNumber(int n) {
        // code here
        int num=n;
        int sum=0;
        while(n!=0){
           int rem=n%10;
           sum+=rem*rem*rem;
           n/=10;
        }
        
        if(num==sum)
            return true;
        else
            return false;
    }
}