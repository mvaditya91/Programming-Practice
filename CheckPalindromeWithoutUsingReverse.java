
public class CheckPalindromeWithoutUsingReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int checkNum = 121;
		StringBuilder sbr = new StringBuilder();
		StringBuilder sbrRev = new StringBuilder();
		Integer checkInt = new Integer(checkNum);
		String orgStr = checkInt.toString();
		char ch[] = orgStr.toCharArray();
		for(int i=0;i<ch.length;i++) {
			sbrRev.append(ch[(ch.length-1)-i]);
		}
		
		String reverseString = sbrRev.toString();
		if(reverseString.equals(orgStr)) System.out.println("True");
		else System.out.println("False");

	}

}
