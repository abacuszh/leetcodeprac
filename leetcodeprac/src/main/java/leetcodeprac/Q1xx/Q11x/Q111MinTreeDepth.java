package leetcodeprac.Q1xx.Q11x;

import leetcodeprac.utils.TreeNode;

public class Q111MinTreeDepth {

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
