class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        k = k % n;
        if (k == 0) return head;

        temp = head;
        for (int i = 0; i < n - k - 1; i++) {
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        temp.next = null;

        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        return newHead;
    }
}