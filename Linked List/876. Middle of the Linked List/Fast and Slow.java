class Solution {
    public ListNode middleNode(ListNode head) {
        // 快、慢两个reference
        
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}