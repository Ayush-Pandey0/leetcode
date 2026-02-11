class Solution {
public:
    TreeNode* build(vector<int>& nums, int l, int r) {
        if (l > r) return nullptr;
        int mid = (l + r) / 2;

        TreeNode* n = new TreeNode(nums[mid]);   // ✅ TreeNode instead of ListNode
        n->left = build(nums, l, mid - 1);
        n->right = build(nums, mid + 1, r);

        return n;
    }

    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return build(nums, 0, nums.size() - 1);  // ✅ use size() - 1
    }
};