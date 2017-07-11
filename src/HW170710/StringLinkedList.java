package HW170710;

public class StringLinkedList {
	
	Node first;  // null
	
	Node last;  // null

	int size;  // 0
	
	public void add(String value) {
		Node node = new Node(value, null);
		
		if (first == null) {
			first = node;
		} else {
			last.next = node;
		}

		last = node;
		
		size++;
	}
	
	public boolean remove(String value) {
		
		boolean result = false;
		
		Node current = first;
		
		Node prev = null;
		
		while (current != null) {
			if (current.value.equals(value)) {
				if (prev == null) {
					first = current.next;
				} else {
					prev.next = current.next;
				}
				size--;
				result = true;
				break;
			}
			prev = current;
			current = current.next;
		}
		
		if (first == null) {
			last = null;
		}
		
		return result;
	}
	
	public String remove(int index) {
		// TODO  Home work
		Node prevDeleting = first;
		String value;

		if (index >= size) return null;
		if (index == 0) {
			value = first.value;
			first = first.next;
			size--;
		}
		else {
			for (int count = 0; count < index - 1; count++) {
				prevDeleting = prevDeleting.next;
			}
			value = prevDeleting.next.value;
			prevDeleting.next = prevDeleting.next.next;
			size--;
		}
		return value;
	}
	
	@Override
	public String toString() {
		// traverse 
		StringBuilder stb = new StringBuilder("[");
//		String result = "[";

		if (first != null) {
			stb.append(first.value);
			
			Node current = first.next;
			
			while (current != null) {
				stb.append(", ").append(current.value);
				current = current.next;
			}
		}

		stb.append("]");
		
		return stb.toString();
	}
}
