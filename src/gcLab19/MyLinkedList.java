package gcLab19;

public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;

	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		if (length == 0) {
			return;
		}
		head = getNodeAt(1);
		// or head = head.getNext();
		// find the second node and set it as the new head
		length--;
	}

	@Override
	public void addAtEnd(String data) {
		// TODO Exercise
		Node node = new Node(data);
		getNodeAt(length - 1).setNext(node);
		length++;
	}

	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
			length--;
		} else {
			// TODO #5
			getNodeAt(length - 2).setNext(null);
			length--;
		}
	}

	@Override
	public String get(int index) {
		Node node = getNodeAt(index);
		if (node == null) {
			throw new IndexOutOfBoundsException();
		} else {
			return node.getData();
		}
//		for(int i=0;i<index;i++) {
//			if(node==null) {
//				return null;
//			}
//			node = node.getNext();
//		}
//		return null;

	}

	public boolean removeAt(int index) {
		if (index >= 0 && index < length) {
			if (index == 0) {
				removeFromBeginning();
			} else if (index == length - 1) {
				removeFromEnd();
			} else {
				getNodeAt(index - 1).setNext(getNodeAt(index + 1));
				length--;
			}
			
			return true;
		} else {
			return false;
		}
//			if (index > 0 && index < length - 1) {
//				getNodeAt(index - 1).setNext(getNodeAt(index + 1));
//			} else if (index == 0) {
//				removeFromBeginning();
//			} else {
//				removeFromEnd();
//			}
//			return true;
//		} else {
//			return false;
//		}

	}

	public boolean insertAt(int index, String item) {
		if (index >= 0 && index <= length) {
			if (index == 0) {
				addAtBeginning(item);
			} else if (index == length) {
				addAtEnd(item);
			} else {
				Node node = new Node(item, getNodeAt(index));
				getNodeAt(index - 1).setNext(node);
				length++;
			}
		
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end
		while (node != null) {
			sb.append(node);
			node = node.getNext();
		}
		return sb.toString();
	}

	@Override
	public int size() {
		return length;
	}

	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return
				// null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

}