package bst2sum;

public class Solution {
	public boolean bst2sum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		BSTIterator left = new BSTIterator(root, true);
		BSTIterator right = new BSTIterator(root, false);
		while (left.hasNext() && right.hasNext() && left.next() != right.next()) {
			int currSum = left.next().val + right.next().val;
			if (currSum == sum) {
				return true;
			} else if (currSum > sum) {
				right.remove();
			} else {
				left.remove();
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode n1 = new TreeNode(1);
		TreeNode n3 = new TreeNode(3);
		TreeNode n5 = new TreeNode(5);
		TreeNode n7 = new TreeNode(7);
		TreeNode n9 = new TreeNode(9);
		TreeNode n11 = new TreeNode(11);
		TreeNode n13 = new TreeNode(13);
		n3.left = n1;
		n3.right = n5;
		n11.left = n9;
		n11.right = n13;
		n7.left = n3;
		n7.right = n11;
		System.out.println(s.bst2sum(n7, 6));
		System.out.println(s.bst2sum(n7, 7));
		System.out.println(s.bst2sum(n7, 12));
		System.out.println(s.bst2sum(n7, 8));
		System.out.println(s.bst2sum(n7, 4));
	}
}
