import java.util.Arrays;


public class BinarySearch {

	public boolean searchBinary(int[] arr,int l,int r,int key) {
		int index=-1;
		int mid = (l+r)/2;
		if(arr[mid]==key) {
			System.out.println("Key "+key+" found at index "+mid);
			index = mid;
			return true;
		} 
		else if(key<arr[mid]) {
			return searchBinary(arr, l, mid-1, key);
		} else {
			return searchBinary(arr, mid+1, r, key);
		} 
	//	return index;
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] searchArray = {11,-1,10,2,1000,5,6};
		BinarySearch obj = new BinarySearch();
		Arrays.sort(searchArray);
		int length = searchArray.length;
		System.out.print(obj.searchBinary(searchArray,0,length-1,1000));
	}

}
