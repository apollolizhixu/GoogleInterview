package bst2sum;

import java.util.Iterator;
import java.util.Stack;

public class BSTIterator implements Iterator{
	Stack<TreeNode> stack;
	boolean leftToRight;
	
	public BSTIterator(TreeNode node, boolean leftToRight) {
		stack = new Stack<TreeNode>();
		this.leftToRight = leftToRight;
		if (leftToRight) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
		} else {
			while (node != null) {
				stack.push(node);
				node = node.right;
			}
		}
	}
	
	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	@Override
	public TreeNode next() {
		return stack.peek();
	}

	@Override
	public void remove() {
		TreeNode node = stack.pop();
		if (leftToRight) {
			node = node.right;
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
		} else {
			node = node.left;
			while (node != null) {
				stack.push(node);
				node = node.right;
			}
		}		
	}
}
