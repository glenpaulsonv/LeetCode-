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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode(0, head);
        ListNode predecessor = sentinel;
            //predecessor precedes the duplicate sublist
        while(head!=null)
        {
            if(head.next!=null && head.val==head.next.val)
            {
                while(head.next!=null && head.val==head.next.val)
                {
                    head=head.next;
                }
                predecessor.next=head.next; //skipping all the duplicates
            }
            else
            {
                predecessor=predecessor.next;
            }
            
            head=head.next;
            
        }
        return sentinel.next;
    }
}

//took the help of leetcode solution