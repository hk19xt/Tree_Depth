package Tree_Depth;

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

/*This class is the implementation class using iterative method. */

public class Tree_Depth {
    
    TreeNode root;
    
    public void traverse(){
        if(root!=null){
            TreeNode traverse_node = root;
            in_order_tree(traverse_node);
            
        }
    }
    
    private void in_order_tree(TreeNode node){
        if(node.left != null){
            in_order_tree(node.left);
        }
        
        System.out.print(node.value + " ");
        
        if(node.right != null){
            in_order_tree(node.right);
        }
    }
  
    public List<Integer> in_order_traverse(Treenode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> output = new ArrayList<Integer>();
        
        TreeNode present = root;
        
        while(!stack.empty() || present !=null){
            while(present !=null){
                stack.add(present);
                present = present.left;
            }
            present = stack.pop();
            
            output.add(present.value);
            present = present.right;
            
        }
        return output;
    
    }
    
}//Tree_Depth
