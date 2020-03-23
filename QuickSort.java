
public class QuickSort {
	
	int[] original = {1000,100,1,0,-1,-10,10000,5};
	
	public int partition(int left,int right) {
		int pivot = original[right];
		int i=left-1;
		for(int j=left;j<right;j++) {
			if(original[j]<=pivot) {
				i++;
				int swap = original[i];
				original[i] = original[j];
				original[j] = swap;
			}
		}
		int swap = original[i+1];
		original[i+1] = original[right];
		original[right] = swap;
		
		return (i+1);
	}
	
	public void quickSort(int left,int right) {
		if(left<right) {
			int partitionIndex = partition(left,right);
			quickSort(left,partitionIndex-1);
			quickSort(partitionIndex+1,right);
		}
	}
	
	public void listElements() {
		for(int i=0;i<original.length;i++) {
		System.out.println(original[i]);
		}
	}
	
	public static void main(String[] args) {
	QuickSort implSort = new QuickSort();
	int size = implSort.original.length-1;
	implSort.quickSort(0,size);
	implSort.listElements();
	}

}
