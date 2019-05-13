/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // 第一次O(n)循环得到长度，第二次循环至O(n/2)得到中间位置
        
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        
        ListNode ans = head;
        for (int i = 0; i < len/2; i++) {
            ans = ans.next; 
        }
        return ans;
    }
}