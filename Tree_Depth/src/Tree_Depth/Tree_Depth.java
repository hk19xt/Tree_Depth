package Tree_Depth;

import java.util.Stack;

/*This class is the implementation class using iterative method. */

public class Tree_Depth {
    public int Tree_Depth(TreeNode root){
        if(root == null) {
            return 0;
        }
        int max_depth = 1;

        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> depth = new Stack<>();

        nodes.push(root);
        depth.push(1);

        while(!nodes.empty()){
            TreeNode pres = nodes.pop();
            int d = depth.pop();

            if(pres.right == null && pres.left == null){
                max_depth = Math.max(max_depth, d);
            }

            if(pres.right != null){
                nodes.push(pres.right);
                depth.push(d + 1);
            }
            if(pres.left != null){
                nodes.push(pres.left);
                depth.push(d+1);
            }
        }
        return max_depth;
    }

}
