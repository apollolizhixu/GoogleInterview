package treeToLinkedList;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;
	TreeNode pre;
	TreeNode suc;
	
	public TreeNode(int x){
		val = x;
		left = null;
		right = null;
		pre = null;
		suc = null;
	}

}
