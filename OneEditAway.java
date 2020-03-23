import java.util.*;

public class OneEditAway {
	private static boolean checkForEdits(String strOne,String strTwo) {
		if(strOne==null || strTwo==null) return false;
		
		int lengthOne = strOne.length();
		int lengthTwo = strTwo.length();
		int i=0,j=0,count=0;
		
		if(Math.abs(lengthOne-lengthTwo)>1) return false;
		
		while(i<lengthOne && j<lengthTwo) {
			if( strOne.charAt(i)==strTwo.charAt(j) ) {
				i++;
				j++;
			} else {
				count++;
				if(lengthOne>lengthTwo) i++;
				else if(lengthOne<lengthTwo) j++;
				else {
					i++;
					j++;
				}
			}
		}
		
		if(i<lengthOne || j<lengthTwo) count++;
		if(count==1) return true;
		else return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstStr = "aab";
		String secondStr = "ab";
		System.out.print("The string are one edit away "+checkForEdits(firstStr, secondStr));
	}

}
