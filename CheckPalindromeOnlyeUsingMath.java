import java.util.Arrays;


public class CheckPalindromeOnlyeUsingMath {

	public static boolean returnReverse(int num, int denomNum) {
		int  orgNum = num;
		int orgNumber = num;
		int length=0;
		StringBuilder sb = new StringBuilder();
		for(;num>0;++length) {
			num = num/10;
		}
		int intArray[] = new int[length];
		
		for(int i=0;i<length;i++) {
		 int newNum = orgNum%10;
		 orgNum = orgNum/10;
		 System.out.println(newNum);
         intArray[i] = newNum;
		}
		for(int i=0;i<intArray.length;i++) {
			sb.append(intArray[i]);
		}
		String revStr = sb.toString();
		int reverseInt = Integer.parseInt(revStr);
		if(reverseInt == orgNumber) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12121;
		System.out.println("Palindrome is "+returnReverse(num,10));
	}

}
