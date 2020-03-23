import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class MergeSortedArrays {
	
	public static int[] sortBoth(int[] arrayOne,int[] arrayTwo) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<arrayOne.length;i++) {
			set.add(new Integer(arrayOne[i]));
		}
		for(int j=0;j<arrayTwo.length;j++) {
			set.add(new Integer(arrayTwo[j]));
		}
		//TreeSet<Integer> newSortedSet = new TreeSet<Integer>(set);
		return set.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {5,3,12,40};
		int[] arrayTwo = {100,1,10,50};
		
		//Arrays.sort(arrayOne);
		//Arrays.sort(arrayTwo);
		
		int[] sortedArray = sortBoth(arrayOne,arrayTwo);
		for(int i=0;i<sortedArray.length;i++) {
			System.out.println(sortedArray[i]);
		}

	}

}
