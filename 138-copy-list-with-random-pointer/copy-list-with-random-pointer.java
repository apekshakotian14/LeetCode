/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        if(head == null) return null;
        Node copyHead = new Node(head.val);
        map.put(head, copyHead);
        Node curr = head;
        Node copyCurr = copyHead;

        while(curr.next != null){
            Node newNode = new Node(curr.next.val);
            copyCurr.next = newNode;
            curr = curr.next;
            copyCurr = copyCurr.next;
            map.put(curr, copyCurr);
        }

        curr = head;
        copyCurr = copyHead;
        while(curr != null){
            if(curr.random != null){
                copyCurr.random = map.get(curr.random);
            }
            curr = curr.next;
            copyCurr = copyCurr.next;
        }
        return copyHead;
    }
}