class Q3_EvenlyDivide {
    public int divisibleByDigits(String s) {

        boolean[] divisible = new boolean[10];

        
        for (int divisor = 1; divisor <= 9; divisor++) {

            int remainder = 0;

            for (int i = 0; i < s.length(); i++) {
                int digit = s.charAt(i) - '0';
                remainder = (remainder * 10 + digit) % divisor;
            }

            divisible[divisor] = (remainder == 0);
        }

        int count = 0;

        
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0 && divisible[digit]) {
                count++;
            }
        }

        return count;
    }
}