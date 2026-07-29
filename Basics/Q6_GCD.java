package Basics;
    
// Notes: 

     /*   ********Euclid's Algorithm*************
     
        gcd(48, 18)

        48 % 18 = 12

        gcd(18,12)

        18 % 12 = 6

        gcd(12,6)

        12 % 6 = 0
        l̥
        Answer = 6

        */
class Q6_GCD {     
    
    public static int gcd(int a, int b) {

       while(b!=0){
           int temp=b;
           b=a%b;
           a=temp;
       }
       return a;
    }
}
