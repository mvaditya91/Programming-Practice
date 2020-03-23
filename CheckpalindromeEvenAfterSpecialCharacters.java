
public class CheckpalindromeEvenAfterSpecialCharacters {
	
	
	   public static boolean isPalindrome(String s) {
	        int i=0;
	        String noSplChar = s.replaceAll("[^a-zA-Z0-9]", "");
	        System.out.println(noSplChar);
	        char[] ch = noSplChar.toCharArray();
	        StringBuilder sb = new StringBuilder();
	        while(i<ch.length) {
	        		sb.append(Character.toLowerCase(ch[i]));
	        		i++;
	        }
	        
	        String justStr = sb.toString();
	        System.out.println(justStr);
	        String revString = sb.reverse().toString();
	        System.out.println(revString);
	        
	        if(justStr.equals(revString)) return true;
	        else return false;
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ab ba";
		System.out.println(isPalindrome(str));

	}

}
