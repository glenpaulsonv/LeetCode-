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

    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null) return null;
        int size = 1;
        ListNode start = head;
        
        while(start.next!=null)
        {
            start=start.next;
            size++;
        }
        
        start.next=head;
        
        k=k%size;
        for(int i=0;i<size-k;i++)
        {
            start=start.next;
        }
        
        ListNode res = start.next;
        start.next = null; //else cycle will be formed
        
        return res;
    }
}

//took the help of the discussion platform