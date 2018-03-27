public class SLList{
	public IntNode first;

	public SLList(int x){
		first = new IntNode(x,null);		
	}

	public static void main(String[] args){
		SLList L = new SLList(10);
		L.addFirst(10);
		L.addFirst(5);
		System.out.println(L.getFirst);
		
	}
	//add x to the front of the list.
	public void addFirst(int x){
		first = new IntNode(x,first);
	}

	/** returns the first item in the list.*/
	public void getFirst(){
		return first.item;
	}
}

