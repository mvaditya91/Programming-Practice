import java.util.LinkedList;
import java.util.TreeSet;



class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }

public class RemoveDuplicatesFromLinkedList {
	
	ListNode head;
	TreeSet initialSet = new TreeSet();
//	public void sortedList(ListNode node) {
//		ListNode temp = node;
//		while(temp.next != null) {
//			initialSet.add(temp.val);
//			temp = temp.next;
//		}
//		initialSet.add(temp.val);
//		LinkedList<Integer> newList = new LinkedList<Integer>(initialSet);
//		
//		System.out.println(newList);
//	}
	public void addToList(ListNode node) {
		if(head==null) {
			head = node;
			initialSet.add(head.val);
		} else {
		ListNode temp=head;
		while(temp.next!=null) {
			initialSet.add(temp.val);
			temp = temp.next;
		}
		temp=node;
		initialSet.add(temp.val);
		LinkedList<Integer> newList = new LinkedList<Integer>(initialSet);
		System.out.println(newList);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromLinkedList listOne = new RemoveDuplicatesFromLinkedList();
		listOne.addToList(new ListNode(1));
		listOne.addToList(new ListNode(2));
		listOne.addToList(new ListNode(18));
		listOne.addToList(new ListNode(4));
		listOne.addToList(new ListNode(5));
		
		//listOne.sortedList(listOne.head);
	}

}


