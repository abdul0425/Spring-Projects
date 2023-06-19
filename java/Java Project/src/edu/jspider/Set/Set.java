package edu.jspider.Set;


public class Set {

	private Node[] a=new Node[10];
	private int count;
	
	public boolean add(Object e)
	{
		int loc=e.hashCode()%a.length;
		if(a[loc]==null)
		{
			a[loc]=new Node(e,null);
			count++;
			return true;
		}
		Node curr=a[loc];
		Node prev=null;
		while(curr!=null)
		{
			if(e==curr.ele)return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(e,null);
		count++;
		return true;
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			Node curr=a[i];
			while(curr!=null)
			{
				System.out.print(curr.ele+"\t");
				curr=curr.next;
			}
		}
	}
}
