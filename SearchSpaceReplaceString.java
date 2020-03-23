
public class SearchSpaceReplaceString {
	
	public static String completeConcatString(String orgString,String repString) {
		int sizeArray = orgString.length();
		StringBuilder fullNewStr= new StringBuilder();
		for(int i=0;i<sizeArray;i++) {
			char ch = orgString.charAt(i);
			if(ch != ' ') {	
			fullNewStr = fullNewStr.append(ch);
			} else if(ch == ' ') {
				fullNewStr = fullNewStr.append(repString);
			}
		}
		return fullNewStr.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "abc de f";
		String replaceString = "%20";
		
		String wholeNewString = completeConcatString(originalString,replaceString);
		System.out.print("Full New String: "+wholeNewString);

	}

}
