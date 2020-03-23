import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class LongestSubstringPalindrome {
	
	LinkedHashMap map = new LinkedHashMap();
	
	public void isPalindrome(String str) {
		StringBuilder sbr = new StringBuilder();
		sbr.append(str);
		String revStr = sbr.reverse().toString();
		if(str.equals(revStr)) {
			map.put(str, str.length());
		}
	}
	
	public static String longestPalindrome(String checkStr) {
		LongestSubstringPalindrome check = new LongestSubstringPalindrome();
		String returnStr=null;
		int length = checkStr.length();
		while(length>=1) {
			check.isPalindrome(checkStr);
			checkStr = checkStr.substring(0, length-1);
			length--;
		}
		
		int maxValue = (int)Collections.max(check.map.values());
		Iterator iterate = check.map.entrySet().iterator();
		while(iterate.hasNext()) {
			Map.Entry element = (Map.Entry) iterate.next();
			int elementValue = (int)element.getValue();
			if(elementValue==maxValue) returnStr = (String)element.getKey();
		}
		
		return returnStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String checkStr = "ababanice";
		String resultStr = longestPalindrome(checkStr);
		if(resultStr!=null)
		System.out.println("Longest Palindrome Substring is: "+resultStr);
		else
			System.out.println("There are no palindromes in the string");

	}

}
