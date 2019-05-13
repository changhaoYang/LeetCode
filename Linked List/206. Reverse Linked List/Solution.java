/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 有问题的做法
        // 第一次循环把val存在数组里面，第二次赋值
        // Time: O(n), Space: O(n)
        
        if (head == null) {
            return null;
        }
        
        int[] vals = new int[5001];     // ！不知道怎样设置array的大小
        int index = 0;
        while (head.next != null) {
            vals[index] = head.val;
            head = head.next;
            index++;
        }
        vals[index] = head.val;
        
        ListNode preNode = new ListNode(vals[index]);
        ListNode ans = preNode;
        for (int i = index-1; i >= 0; i--) {
            ListNode newNode = new ListNode(vals[i]);
            preNode.next = newNode;
            preNode = newNode;
        }
        return ans;
    }
}