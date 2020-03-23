import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;


public class SortingTwoLinkedListsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		LinkedList<Integer> listTwo = new LinkedList<Integer>();

		listOne.add(10);
		listOne.add(5);
		listOne.add(1);
		
		listTwo.add(20);
		listTwo.add(1000);
		listTwo.add(2);
		
		listOne.addAll(listTwo);
		Collections.sort(listOne);
		System.out.println("Sorted List \n"+listOne);
		// Uses MergeSort with O(nlog(n)) time complexity
		//ListIterator<Integer> listIterate = new 
	}

}
