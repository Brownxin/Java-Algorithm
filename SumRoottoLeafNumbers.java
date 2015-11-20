package Leetcode;

public class SumRoottoLeafNumbers {
//	Solution 2
	public int getSum(TreeNode node,int sum){
		if(node==null){
			return sum;
		}
		sum=sum*10+node.val;
		if(node.left==null){
			return getSum(node.right,sum);
		}
		if(node.right==null){
			return getSum(node.left,sum);
		}
		return getSum(node.right,sum)+getSum(node.left,sum);
	}
	public int sumNumbers(TreeNode root){
		return getSum(root,0);
	}
//	Solution 1
//	public int getSum(TreeNode node,int sum){
//		if(node==null){
//			return 0;
//		}
//		sum=sum*10+node.val;
//		if(node.right!=null && node.left!=null){
//			return getSum(node.right,sum)+getSum(node.left,sum);
//		}
//		else if(node.left==null && node.right!=null){
//			return getSum(node.right,sum);
//		}
//		else if(node.right==null && node.left!=null){
//			return getSum(node.left,sum);
//		}
//		return sum;
//	}
//	public int sumNumbers(TreeNode root){
//		return getSum(root,0);
//	}
}
