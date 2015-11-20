package Leetcode;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer>{
	private Integer next;
	private Iterator<Integer> iter;
	public PeekingIterator(Iterator<Integer> iterator){
		iter=iterator;
		if(iter.hasNext()){
			next=iter.next();
		}
		
	}
	
	public Integer peek(){
		return next;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return next!=null;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		int res=next;
		next=iter.hasNext()?iter.next():null;
		return res;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
