package Tree_Depth;

import java.util.Stack;

/*This class is the implementation class using iterative method. */

public class Tree_Depth {
    public int Tree_Depth(TreeNode root){
        
        int max_depth = 1; //Initialization of the maximum number of depth.
        
        if(root == null) { //If there is no nodes in the tree, then return zero.
            return 0;
        }
        
        Stack<TreeNode> nodes = new Stack<>(); //Initialization of the tree for storing the nodes.
        Stack<Integer> depth = new Stack<>(); //Initialization of counting the number of depths of the tree.

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

}//Tree_Depth
