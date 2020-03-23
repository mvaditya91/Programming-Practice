
public class MergeSort {

	int[] original = {10000,-10000,0,-1,50,2,1000,10};
	
	public void merge(int left,int mid,int right) {
		int lAS = (mid-left+1);
		int rAS = (right-mid);
		
		int[] leftArray = new int[lAS];
		int[] rightArray = new int[rAS];
		
		for(int i=0;i<lAS;i++) {
			leftArray[i] = original[left+i];
		}
		for(int j=0;j<rAS;j++) {
			rightArray[j] = original[mid+1+j];
		}
		
		int i=0,j=0,k=left;
		while(i<lAS && j<rAS) {
			if(leftArray[i]<=rightArray[j]) {
				original[k++] = leftArray[i++];
			} else {
				original[k++] = rightArray[j++];
			}
		}
		
		while(i<lAS) {
			original[k++] = leftArray[i++];
		}
		while(j<rAS) {
			original[k++] = rightArray[j++];
		}
	}
	
	public void mergeSort(int left,int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(left,mid);
			mergeSort(mid+1,right);
			merge(left,mid,right);
		}
	}
	
	public void listElements() {
		for(int i=0;i<original.length;i++) {
			System.out.println(original[i]);
		}
	}
	
	public static void main(String[] args) {
	MergeSort implSort = new MergeSort();
	int size = implSort.original.length-1;
	implSort.mergeSort(0,size);
	implSort.listElements();
	}
}
