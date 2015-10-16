package treeToLinkedList;

public class Solution {
	
	TreeNode prev = null;
	TreeNode listHead = null;
	public TreeNode thread(TreeNode root){
		helper(root);
		return listHead;
	}
	public TreeNode helper(TreeNode root){
		if (root == null){
			return null;
		}
		thread(root.left);
		if (prev != null){
			prev.right = root;
		} else {
			listHead = root;
		}
		root.left = prev;
		prev = root;
		thread(root.right);
		
		return root;
	}
	
	public void traverseLinkedList(){
		TreeNode node = listHead;
		while (node != null){
			System.out.print(node.val + "->");
			node = node.right;
		}
	}
	
	public static void main(String[] args) {
		TreeNode l1 = new TreeNode(1);
		TreeNode l2 = new TreeNode(2);
		TreeNode l3 = new TreeNode(3);
		TreeNode l4 = new TreeNode(4);
		TreeNode l5 = new TreeNode(5);
		TreeNode l6 = new TreeNode(6);
		TreeNode l7 = new TreeNode(7);
		
		l4.left = l2;
		l4.right = l6;
		l2.left = l1;
		l2.right = l3;
		l6.left = l5;
		l6.right = l7;
		Solution s = new Solution();
		s.thread(l4);
		s.traverseLinkedList();
		
		String str = "abcd".substring(0, 0);
		System.out.println(str);
	}

}
