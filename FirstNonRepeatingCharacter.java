import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FirstNonRepeatingCharacter {
	public static char checkFirstNonRepeatingChar(String openStr) {
		int count=1,i=0;
		char returnChar=' ';
		StringBuilder sb = new StringBuilder();
		char[] ch = openStr.toCharArray();
		HashMap map = new HashMap();
		for(;i<ch.length;i++) {
			if(map.containsKey(ch[i]))
			map.put(ch[i],count+1);
			else
			map.put(ch[i],count);
		}
		Iterator iterate = map.entrySet().iterator();
		while(iterate.hasNext()) {
			Map.Entry mapElement = (Map.Entry)iterate.next();
			int firstNonRepeat = (int)mapElement.getValue();
			if(firstNonRepeat==1) {
				returnChar = (char)mapElement.getKey();
				break;
			}
		}
		
		if(returnChar!=' ') return returnChar;
		else {
			return '\0';
		}
		
	}
	public static void main(String[] args) {
		String baseStr = "aabbddeeffgg";
		char ch = checkFirstNonRepeatingChar(baseStr);
		if(ch!='\0') System.out.println("First non-repeating character is:"+ch);
		else System.out.println("There are no repeating characters in the string"+baseStr);
	}

}
