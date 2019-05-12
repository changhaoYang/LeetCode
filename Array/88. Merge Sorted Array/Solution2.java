class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // 三个指针
        // k指向nums1的最后一个数
        // i指向nums1有效部分最后一个数
        // j指向nums2的最后一个数
        // 比较nums1和nums2的大小
        
        int i=m-1, j=n-1, k=m+n-1;
        while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
        while (j>-1)         A[k--]=B[j--];
    }
}