public class IntList  {
	public int head;
	public IntList tail;
	public IntList(int h, IntList t){
		head = h;
		tail = t;
	}

	/* Returns yhe nimber of intgers in this IntList,
	 * using... recursion*/
	public int size(){
		if(tail == null)
			return 1;
		return 1 + tail.size();
	}
	/* Returns the nimber of intgers in this IntList,
	 * without... recursion*/
	public int sizeInterative(){
		IntList p = this;
		int size = 0;
		while(p != null){
			size = size + 1;
			p = p.tail;
		}
		return size;
	}

	/* Return the ith item of this InList
	   Where front item is 0th item*/
	public int get(int i){
		if(i == 0){
			 return head;
		}
		return tail.get(i-1);
	}

	public static void main(String[] args) {
		IntList L = new IntList(5, null);
		L = new IntList(10, L);
		L = new IntList(15, L);

		System.out.println(L.head);
		System.out.println(L.tail.head);
		System.out.println(L.size());
		System.out.println(L.sizeInterative());
		System.out.println(L.get(2));

	}
}