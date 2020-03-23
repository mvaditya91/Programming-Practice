import java.util.Arrays;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int palindromeOrNot = 121;
		Integer classInt = new Integer(palindromeOrNot);
		String str = classInt.toString();
		
		StringBuilder sbr = new StringBuilder(str);
		StringBuilder newsbr = new StringBuilder();
		newsbr = sbr.reverse();
		if(sbr.equals(newsbr)) System.out.println("The number"+ palindromeOrNot+" is a palindrome");
		else System.out.print("The number "+palindromeOrNot+" is not a palindrome");

	}

}
