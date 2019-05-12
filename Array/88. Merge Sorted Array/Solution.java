class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 在原数组后加入新数组元素，然后再次排序即可
        // Time: O(n), Space: O(1)
        
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}