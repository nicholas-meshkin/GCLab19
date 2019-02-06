package gcLab19;
public class ListApp {

	public static void main(String[] args) {
//		testArrayList();
		testLinkedList();
	}
	
//	private static void testArrayList() {
//		MyArrayList list = new MyArrayList();
//		
//		list.addAtBeginning("B");
//		list.addAtBeginning("A");
//		list.addAtEnd("C");
//		list.addAtEnd("D");
//		list.removeFromBeginning();
//		list.removeFromEnd();
//		
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//	}
//	
	private static void testLinkedList() {
		MyLinkedList list = new MyLinkedList();
		
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		System.out.println(list);
		list.addAtEnd("C");
		list.addAtEnd("D");
		System.out.println(list);
		list.removeFromBeginning();
		list.removeFromEnd();
		System.out.println(list);
		list.insertAt(0, "butt");
		System.out.println(list);
		list.insertAt(0,"fart");
		System.out.println(list);
		list.removeAt(0);
		
		
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(4));//fix get out of range
		System.out.println(list);
	}

}