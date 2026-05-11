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
        if(head==null) return head;
        ListNode curr=head;
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val!=curr.val){
                curr.next=temp;
                curr=curr.next;
            }
            temp=temp.next;     
        }
        if(curr.next!=null){
            curr.next=null;
        }
        return head;
    }
}