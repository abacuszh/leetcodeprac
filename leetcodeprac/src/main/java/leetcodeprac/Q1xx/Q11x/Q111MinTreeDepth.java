package leetcodeprac.Q1xx.Q11x;

import leetcodeprac.utils.TreeNode;

/**
 * @author user
 *
 */
public class Q111MinTreeDepth {

	/**
	 * find the min depth of a tree
	 * 1	if the treenode is null, its depth is 0
	 * 2	if one the of the branches is null, then calculate the min depth of the other one
	 * 3	if both of the branches are not null, then find the min depth recursively
	 * @param TreeNode
	 * @return mindepth
	 */
	public int minDepth(TreeNode root) {

		if ( null == root ) {
			return 0;
		} else if ( null == root.left && null != root.right ) {
            return 1 + minDepth(root.right);
        } else if ( null == root.right && null != root.left ) {
            return 1 + minDepth(root.left);
        } else {
			return 1 + Math.min(minDepth(root.left), minDepth(root.right));
		}
    }
}
