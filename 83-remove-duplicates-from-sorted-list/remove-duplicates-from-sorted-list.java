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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&slow!=null){
            if(fast.val==slow.val){
                fast=fast.next;
            }
            else{
                slow.next=fast;
                slow=slow.next;
            }
        }
        if(slow!=null) slow.next=fast;
        return head;
    }
}