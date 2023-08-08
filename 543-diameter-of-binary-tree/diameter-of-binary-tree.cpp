/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
private:
    int depth(int &maxdepth,TreeNode* root)
    {
        if(root==NULL)return 0;
        int left =depth(maxdepth,root->left);
        int right =depth(maxdepth,root->right);
        maxdepth=max(maxdepth,right +left);
        return 1+max(right ,left);
    }
public:
    int diameterOfBinaryTree(TreeNode* root) {
        int maxdepth=0;
        int result=depth(maxdepth,root);
        return maxdepth;
        
    }
};