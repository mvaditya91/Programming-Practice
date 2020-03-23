import java.util.Arrays;


public class StringPermutation {
	
	public static String sortString(String mainStr) {
		char charStr[] = mainStr.toCharArray();
		Arrays.sort(charStr);
		return (new String(charStr));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainStr = "abcd";
		String checkString = "adcb";
		String newStringOne = sortString(checkString);
		String newStringTwo = sortString(mainStr);
		if(newStringOne.equals(newStringTwo)) System.out.println("Strings have the same permutation");
		else System.out.println("String are not permutation of each other");
	}

}
