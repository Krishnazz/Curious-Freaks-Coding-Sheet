package Basics;
class Q10_Palindrome {
    public boolean isPalindrome(int n) {
        // code here
        int rev=0;
        int num=n;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(num==rev)
            return true;
        else
            return false;
    }
}