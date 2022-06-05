package CommonQuestions;

/* Base class to create and manage linked list :
 * 
 */

class LinkedListNode {
	int data;
	LinkedListNode next;
	
	LinkedListNode(int data) {
		this.data = data;
	}
}

public class LinkedList {
	
	
	LinkedListNode head;
	
	public LinkedList() {
		
	}
	
	// LinkedList from Array..
	public LinkedList(int[] arr) {
		createLinkedList(arr);
	}
	
	public void createLinkedList(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			LinkedListNode node = new LinkedListNode(arr[i]);
			if(head == null) {
				head = node;
			} else {
				
				LinkedListNode n = head;
				while(n.next != null) {
					n = n.next;
				}
				n.next = node;
				
			}
		}
	}
	
	public void display() {

		LinkedListNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void addFirst(int data) {
		LinkedListNode node = new LinkedListNode(data);
		node.next = head;
		head = node;
	}
	
	
	public void addLast(int data) {
		LinkedListNode node = new LinkedListNode(data);
		if(head == null) {
			head = node;
			return;
		}
		LinkedListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		head = head.next;
	}
	
	public void deleteLast() {		
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		LinkedListNode secondLastNode = head;
		LinkedListNode lastNode = head.next;
		
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLastNode = secondLastNode.next;
		}
		
		secondLastNode.next = null;
	}
	
	public void delete(int data,boolean deleteAll) {
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		

		if(head.data == data) {
			head = head.next; 
		}
		
		LinkedListNode temp = head;
		
		while(temp.next != null) {
			if(temp.next.data == data) {
				temp.next = temp.next.next;
				if(!deleteAll) {
					return ;
				}
			}
			temp = temp.next;
		}
	}
	
	public int search(int data) {
		if(head == null) {
			System.out.println("List is empty.");
			return 0;
		}
		
		int index = 0;
		
		LinkedListNode temp = head;
		
		while(temp != null) {
			if(temp.data == data) {
				return index;
			}
			temp = temp.next;
			index++;
		}
		System.out.println("data not present in list.");
		return 0;
	}
	
}	
