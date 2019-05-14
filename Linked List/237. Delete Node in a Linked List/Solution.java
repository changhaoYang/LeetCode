/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // 并不知道head的位置，所以只能用特殊的办法
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}