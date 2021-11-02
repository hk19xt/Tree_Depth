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

        nodes.push(root);//The first root will be pushed into the node stack.
        depth.push(1); //The initial depth is 1.

        while(!nodes.empty()){//This while loop will count the maximum number of tree depth. 
            TreeNode pres = nodes.pop(); //The present node will be popped up.
            int d = depth.pop(); //This integer variable will count the number of tree depth.

            if(pres.right == null && pres.left == null){ //If there is no node for the right and left tree,
                max_depth = Math.max(max_depth, d); //then count the maximum depth of the tree.
            }

            if(pres.right != null){ //If there is the node for input of right tree,
                nodes.push(pres.right); //then push the node to the right tree.
                depth.push(d + 1);//Also, add this node for counting the number of tree depth.
            }
            if(pres.left != null){//If there is the node for input of left tree,
                nodes.push(pres.left);//then push the node to the left tree.
                depth.push(d+1);//Also, add this node for counting the number of tree depth.
            }
        }
        return max_depth; //After counting the maximum number of depth tree, then return the max_depth value.
    }

}//Tree_Depth
