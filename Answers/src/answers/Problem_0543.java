package answers;
/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * <p>
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 * The length of a path between two nodes is represented by the number of edges between them.
 * 
 * @author Jackson Splinter
 */
public class Problem_0543 
{
    int max = 0;
    /**
     * Puts the first root in the program ans returns the final solution
     * <p>
     * O(1)
     * 
     * @param root root of the tree we are measuring.
     * @return returns the maximum diameter from all the children nodes.
     */
    public int diameterOfBinaryTree(TreeNode root) 
    {
        maxDepth(root);
        return max;
    }
    /**
     * Depth first Search to find the largest diameter.
     * <p>
     * Goes through each node and adds one to the width for each child node it has.
     * Does all the heavy lifting of the program.
     * <p>
     * O(V+E)
     * 
     * @param root root of the tree we are measuring.
     * @return returns the maximum diameter from all the children nodes.
     */
    private int maxDepth(TreeNode root) 
    {
        if (root == null) {return 0;}
     
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
}