class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        // 当这个数为0的时候，下一位必为1（不管是1bit还是2bits）
        // 当这个数为1的时候，这一个字母占两个数字，下一个字母开始于第三个字母
        
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 0) {
                i++;
            } else {
                i += 2;
            }
        }
        return i == bits.length - 1;    
    }
}