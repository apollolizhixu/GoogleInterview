package Print_Tree;

public class Solution {
	/*
	 * Print a tree like (Parent ( leftchild (leftchild, rightchild), rightchild(leftchild,rightchild) ) )
	 */
	public String printTree(TreeNode root){
		if (root == null){
			return "null";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		sb.append(helper(root));
		sb.append(")");
		return sb.toString();
	}
	public String helper(TreeNode root){
		StringBuilder sb = new StringBuilder();

		sb.append(root.val);
		
		sb.append("(");
		if (root.left != null){
			sb.append(helper(root.left));
		} else {
			sb.append("null");
		}
		sb.append(",");

		if (root.right != null){
			sb.append(helper(root.right));
		} else {
			sb.append("null");
		}
		sb.append(")");
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode l1 = new TreeNode(1);
		TreeNode l2 = new TreeNode(2);
		TreeNode l3 = new TreeNode(3);
		TreeNode l4 = new TreeNode(4);
		TreeNode l5 = new TreeNode(5);
		TreeNode l6 = new TreeNode(6);
		TreeNode l7 = new TreeNode(7);
		l1.left = l2;
		l1.right = l3;
		l2.left = l4;
		l2.right = l5;
		l3.left = l6;
		l3.right = l7;
		System.out.println(s.printTree(l1));
	}

}
