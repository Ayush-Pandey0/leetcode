class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // move both until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // remove node
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
