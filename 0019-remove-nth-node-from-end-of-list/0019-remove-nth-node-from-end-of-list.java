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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        
        ListNode currentNode = head;
        
        while(currentNode != null){
            currentNode = currentNode.next;
            length++;
        }
        
        if(length == n){
            return head.next;
        }
        
        int nodeBeforeRemovedIndex = length - n - 1;
        currentNode = head;
        
        for(int i=0; i<nodeBeforeRemovedIndex; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        
        return head;
    }
}