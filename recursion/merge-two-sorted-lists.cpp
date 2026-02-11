class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        // Dummy node to start the merged list
        ListNode dummy;
        ListNode* tail = &dummy;

        // Traverse both lists
        while (list1 && list2) {
            if (list1->val < list2->val) {
                tail->next = list1;
                list1 = list1->next;
            } else {
                tail->next = list2;
                list2 = list2->next;
            }
            tail = tail->next;
        }

        // Attach remaining part
        if (list1) tail->next = list1;
        if (list2) tail->next = list2;

        return dummy.next;
    }
};
