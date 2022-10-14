/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        return solve(root, new HashSet<>(), k);
    }
    
    public boolean solve(TreeNode root, HashSet<Integer> set, int k){
        if(root == null) return false;
        if(set.contains(k - root.val)){
            return true;
        }
        set.add(root.val);
        return solve(root.left, set, k) || solve(root.right, set, k);
    }
}