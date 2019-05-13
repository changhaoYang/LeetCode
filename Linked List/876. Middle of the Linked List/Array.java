class Solution {
    public ListNode middleNode(ListNode head) {
        // 使用array解决
        // Time: O(n), Space: O(n)
        
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
}