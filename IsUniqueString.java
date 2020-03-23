
public class IsUniqueString {
	
	public static int isUnique(String mainStr) {
		int strSize = mainStr.length();
		if(strSize == 1) {
			return 1;
		}else if(strSize == 0) {
			return 0;
		}
		else {
		for(int i=0;i<strSize;i++) {
			char newChar = mainStr.charAt(i);
			for(int j= i+1;j<strSize;j++) {
				if(newChar == mainStr.charAt(j)) return 2;
			}
		}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainStr="kavya";
		int result = isUnique(mainStr);
		if(result == 1) System.out.print("The String is Unique");
		else if(result == 0)System.out.println("The String is Empty");
		else System.out.print("The String is repetitive");
	}

}
