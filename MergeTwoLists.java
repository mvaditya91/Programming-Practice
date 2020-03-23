import java.util.Collections;
import java.util.LinkedList;

class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
public class MergeTwoLists {
	
	Node head;
	public Node sortedMerge(Node listOne,Node listTwo) {
		if(listOne==null) return listTwo;
		if(listTwo==null) return listOne;
		
		if(listOne.data<listTwo.data) {
			listOne.next = sortedMerge(listOne.next,listTwo);
			return listOne;
		} else {
			listTwo.next = sortedMerge(listOne, listTwo.next);
			return listTwo;
		}
	}
	public void addToList(Node node) {
		if(head==null) {
			head = node;
		} else {
		Node temp=head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=node;
		}
	}
	
	public static void printList(Node node) {
		Node temp = node;
		while(temp.next!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeTwoLists listOne = new MergeTwoLists();
		MergeTwoLists listTwo = new MergeTwoLists();
		
		// add to the listOne
		listOne.addToList(new Node(1));
		listOne.addToList(new Node(2));
		listOne.addToList(new Node(3));
		listOne.addToList(new Node(4));
		listOne.addToList(new Node(5));
		//listOne.addToList(new Node(16));
		//add to listTwo
		listTwo.addToList(new Node(6));
		listTwo.addToList(new Node(7));
		listTwo.addToList(new Node(8));
		listTwo.addToList(new Node(9));
		
		
		
		listOne.head = (new MergeTwoLists()).sortedMerge(listOne.head,listTwo.head);
		printList(listOne.head);
	}

}
