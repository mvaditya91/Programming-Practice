
public class StringCompression {

	private static void compressString(String mainStr) {
		int occurences = 1;
		char currentChar = mainStr.charAt(0);
		
		StringBuilder compressString = new StringBuilder();
		
		for(int i=1;i<mainStr.length();i++) {
			
			char compChar = mainStr.charAt(i);
			if(compChar == currentChar) {
				occurences++;
			} else {
				compressString.append(""+currentChar+occurences);
				occurences=1;
				currentChar = compChar;
			}
		}
		compressString.append(""+currentChar+occurences);
		
		System.out.println("Compressed String: "+compressString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainStr = "aabb";
		compressString(mainStr);
	}

}
