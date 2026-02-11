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
        if(head==null||head.next==null) return head;
        ListNode s=head;
        int size=0;
        while(s!=null){
            s=s.next;
            size++;
        }
        ListNode dummy=head;
        for(int i=0;i<k%size;i++){
            int first=dummy.val;
            ListNode slow=head;
            int second;
            while(slow!=null){
                second=slow.val;
                slow.val=first;
                first=second;
                slow=slow.next;
            }
            dummy.val=first;
        }
        return head;
    }
}