class Solution {
    //摩尔投票算法，也就是抵消算法
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for(int num: nums) {
            if(count == 0) {
                candidate = num;
            }
            
            if(num == candidate) {
                count--;
            } else {
                count++;
            }
        }
        
        return candidate;
    }
}