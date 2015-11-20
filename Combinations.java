package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	List<List<Integer>> res;
	public void dfs(int start,int k,List<Integer> tmp,int n){
		if(tmp.size()==k){
			res.add(tmp);
		}
		for(int i=start;i<n+1;i++){
			tmp.add(i);
			dfs(i+1,k,tmp,n);
			tmp.remove(tmp.size()-1);
		}
	}
	public List<List<Integer>> combine(int n, int k){
		if(n==0){
			return null;
		}
		List<Integer> tmp=new ArrayList<Integer>();
		dfs(1,k,tmp,n);
		return res;
	}
}
