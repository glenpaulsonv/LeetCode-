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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp;
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val)
        {
            temp = new ListNode(l1.val);
            temp.next=mergeTwoLists(l1.next,l2);
        }
        else
        {
            temp = new ListNode(l2.val);
            temp.next=mergeTwoLists(l1,l2.next);
        }
        return temp;
         
    }
}
//used the help of the discussion platform