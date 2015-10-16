package Kth_biggest_element_in_BST;

public class Solution {
	TreeNode pointer = null;
	public int KthElement(TreeNode root, int k){
		if (root == null){
			return -1;
		}
		helper(root, k);
		return pointer.val;
	}
	public int helper(TreeNode root, int k){
		if (root == null){
			return 0;
		}
		
		int left = helper(root.left, k);
		int right = 0;		
		int count = left + 1;
		
		if (count == k){
			pointer = root;
			return k;
		} else if (count < k){
			right = helper(root.right, k - count);
		}
		return left + 1 + right;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode l1 = new TreeNode(4);
		TreeNode l2 = new TreeNode(2);
		TreeNode l3 = new TreeNode(6);
		TreeNode l4 = new TreeNode(1);
		TreeNode l5 = new TreeNode(3);
		TreeNode l6 = new TreeNode(5);
		TreeNode l7 = new TreeNode(7);
		l1.left = l2;
		l1.right = l3;
		l2.left = l4;
		l2.right = l5;
		l3.left = l6;
		l3.right = l7;
		System.out.println(s.KthElement(l1, 5));
	}

}
