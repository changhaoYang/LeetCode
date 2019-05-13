class Solution {
    public ListNode reverseList(ListNode head) {
        // Recursive
        // n1 → … → nk-1 → nk → nk+1 ← … ← nm
        // We want nk+1’s next node to point to nk.
        // nk.next.next = nk;
        
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}