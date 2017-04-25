public class SLList  {
	private IntNode first;

	public SLList(int x){
		first = new IntNode(x, null);
	}
	
	/* adds x to the front of the list */
	public void addFirst(int x){
		first = new IntNode(x, first);
	}
	/** Returns the first item in the list*/
	public int getFirst(){
		return first.item;
	}

	public void addLast(int x){
		if(first == null){
			first = new IntNode(x, null);
		}
		IntNode tmp = first;
		while(tmp.next != null)
			tmp = tmp.next;
		tmp.next = new IntNode(x, null);
	}
	private int size(IntNode p){
		if(p.next == null)
			return 1;
		return 1 + size(p.next);
	}
	public int size(){
		return size(first);
	}

	public static void main(String[] args){
		SLList L = new SLList(10);

		L.addFirst(10);
		L.addFirst(5);
		System.out.println(L.size());
		System.out.println(L.getFirst());
		

	}
}