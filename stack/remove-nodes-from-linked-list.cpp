/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNodes(ListNode* head) {
        if (!head) return nullptr;

        // Reverse the list
        ListNode* prev = nullptr;
        while (head) {
            ListNode* nextNode = head->next;
            head->next = prev;
            prev = head;
            head = nextNode;
        }

        // Remove nodes smaller than the max value seen so far
        int maxVal = prev->val;
        ListNode* curr = prev;
        ListNode* dummy = new ListNode(0);
        ListNode* tail = dummy;

        while (curr) {
            if (curr->val >= maxVal) {
                tail->next = curr;
                tail = curr;
                maxVal = curr->val;
            }
            curr = curr->next;
        }

        tail->next = nullptr;

        // Reverse again to restore original order
        head = dummy->next;
        prev = nullptr;
        while (head) {
            ListNode* nextNode = head->next;
            head->next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }
};
