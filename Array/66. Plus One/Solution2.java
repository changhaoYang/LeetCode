class Solution {
    public int[] plusOne(int[] digits) {
        // O(n)比我那个厉害
        
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            // 如果有数不是9，那么+1后便得到结果并return
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // 如果数是9，那么就进位取0
            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }               
}