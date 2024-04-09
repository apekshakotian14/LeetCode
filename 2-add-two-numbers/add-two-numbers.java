/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode res = new ListNode(0);
       ListNode cur = res;

       int carry = 0;
       int sum = 0;

       while(l1 != null || l2 != null){
        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;

        sum = val1 + val2 + carry;
        carry = sum / 10;
        cur.next = new ListNode(sum % 10);
        cur = cur.next;

        if(l1 != null){
            l1 = l1.next;
        }

        if(l2 != null){
            l2 = l2.next;
        }
        
       }

       if(carry > 0){
        cur.next = new ListNode(carry);
       }

       return res.next;
    }
}