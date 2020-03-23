import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class PermutatePalindrome {
	
	private static boolean isPermPalin(String original) {
		
		int countOdd=0;
		
		Map<Character, Integer> newMap = new HashMap<Character, Integer>();
		for(int i=0;i<original.length();i++) {
			char ch = original.charAt(i);
			if (ch==' ') continue;
			if(newMap.containsKey(ch)) {
				int existingValue = newMap.get(ch);
				newMap.put(ch,existingValue+1);
			} else {
				newMap.put(ch, 1);
			}
		}
		
		Iterator mapIterate = newMap.entrySet().iterator();
		while(mapIterate.hasNext()) {
			Map.Entry newElement = (Map.Entry) mapIterate.next();
			int value = (int)newElement.getValue();
			
			if(value%2!=0) countOdd++;
		}
		
//		for(Map.Entry newElement: newMap.entrySet()) {
//			if( (((int)newElement.getValue())%2)!= 0) countOdd++; 
//			//System.out.println(newElement.getKey()+" -> "+newElement.getValue());
//		}
		
		System.out.print(countOdd);
		if(countOdd>1)return false;
		else {return true;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "abbba";
		boolean isTrue = isPermPalin(original);
		System.out.print(isTrue);

	}

}
