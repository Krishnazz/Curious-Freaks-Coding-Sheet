
import java.math.BigInteger;

public class Q2_LastDigit{
    static int getLastDigit(String a, String b) {
        // code here
          BigInteger base = new BigInteger(a);
        BigInteger exponent = new BigInteger(b);
        BigInteger modulus = BigInteger.TEN; 
        
        
        BigInteger result = base.modPow(exponent, modulus);
 
        int lastDigit = result.intValue();
        
        return lastDigit;
    }
}