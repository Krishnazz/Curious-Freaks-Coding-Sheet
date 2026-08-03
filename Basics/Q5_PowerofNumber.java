

public class Q5_PowerofNumber {
    public int reverseExponentiation(int n) {
        // code here
        int rev=0,rem=0;
        int num=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
      
       return  (int) Math.pow(num,rev);
        
    }
}