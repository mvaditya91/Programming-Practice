import java.util.Collections;
import java.util.LinkedList;


public class MergeTwoListUsingCollections {

	public boolean sortedMerge(LinkedList<Integer> listOne,LinkedList<Integer> listTwo) {
		if(listOne==null || listTwo==null) {
			System.out.println("Empty Lists");
			return false;
		}
		
		if(listOne.data<listTwo.data) {
			listOne.next = sortedMerge(listOne.next,listTwo);
			return listOne;
		} else {
			listTwo.next = sortedMerge(listOne, listTwo.next);
			return listTwo;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> arrayOne = new LinkedList<Integer>();
		LinkedList<Integer> arraytwo = new LinkedList<Integer>();

		arrayOne.add(1);
		arrayOne.add(10);
		arrayOne.add(4);
		arrayOne.add(13);
		
		arraytwo.add(5);
		arraytwo.add(7);
		arraytwo.add(12);
		
		Collections.sort(arrayOne);
		Collections.sort(arraytwo);
		
	}

}
