package leetcodeprac.Q1xx.Q10x;

import leetcodeprac.utils.TreeNode;

public class Q104MaxTreeDepth {

	public int maxDepth(TreeNode root) {

		if ( null == root ) {
			return 0;
		} else {
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		}
	}
}
