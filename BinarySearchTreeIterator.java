package Leetcode;

import java.util.Stack;

public class BinarySearchTreeIterator {
	private Stack<TreeNode> stack;
	public BinarySearchTreeIterator(TreeNode root){
		stack=new Stack<TreeNode>();
		while(root!=null){
			stack.push(root);
			root=root.left;
		}
	}
	
	public boolean hasNext(){
		return !stack.isEmpty();
	}
	
	public int next(){
		TreeNode node=stack.pop();
		int res=node.val;
		if(node.right!=null){
			node=node.right;
			while(node!=null){
				stack.push(node);
				node=node.left;
			}
		}
		return res;
	}
}
