class Solution {
    public ListNode reverseList(ListNode head) {
        // Iterative
        // 只改变箭头的方向
        
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}