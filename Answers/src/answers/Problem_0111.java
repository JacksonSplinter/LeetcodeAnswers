package answers;
/**
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * 
 * @author Jackson Splinter
 */
public class Problem_0111 
{
    /**
     * Returns the number corresponding to the layer you can find the first leaf.
     * <p>
     * Uses recursion in order to find the solution. if the root is <code>null</code> it returns 0,
     * when both the right and left are <code>null</code> then that means the root is a leaf.
     * Adds 1 to each layer you have to go down before you find a leaf.
     * <p>
     * O(V+E)
     * 
     * @param root  the root of the tree being searched.
     * @return      the first layer that a leaf is found.
     */
    public int minDepth(TreeNode root) 
    {
        if(root==null){return 0;}
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 || right == 0) 
        {
            return Math.max(left, right) + 1;
        }
        else
        {
            return Math.min(left, right) + 1;
        }
    }
}