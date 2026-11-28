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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
       // List<Integer> li=new ArrayList<>();
        fun(root,q,ans);
        return ans;

        
    }
    static void fun(TreeNode root,Queue<TreeNode> q,List<List<Integer>> ans){
        if(root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode p = q.poll();

                li.add(p.val);

                if(p.left!=null){
                    q.add(p.left);
                }
                 if(p.right!=null){
                    q.add(p.right);
                }
               
            }
            ans.add(li);
        }
    }
}