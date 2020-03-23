import java.util.Arrays;


public class Practice {
	
	public static void checkPalindrome(int checkInt) {
		int numOne = checkInt, orgNum=checkInt,revNum=0;
		int length=0,remNum=0,i=0;
		int arrayRev[] = new int[checkInt];
		while(checkInt>0) {
			length++;
			checkInt=(checkInt/10);
		}
		while(length>0) {
			remNum = (int) (((numOne)%10) * (Math.pow(10, length-1)));
			arrayRev[i] = remNum;
			//System.out.println(arrayRev[i]);
			length=length-1;
			numOne = numOne/10;
			i++;
		}
		
		for(int j=0;j<arrayRev.length;j++) {
			revNum = revNum+arrayRev[j];
		}
		
		if(orgNum==revNum) System.out.print("Number is a palindrome");
		else System.out.print("Number is not a palindrome");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int checkInt = 121121;
	checkPalindrome(checkInt);
	}	

}
