
public class CheckRotationOfString {

	private static boolean isSubString(String strOne,String strTwo) {
		int strOneLength = strOne.length();
		int strTwoLength = strTwo.length();
		String twoStrTwo = strTwo+strTwo;
		if( (strOneLength==strTwoLength) && (twoStrTwo.contains(strOne))) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOne = "waterbottle";
		String strTwo = "erbottlewat";
		
		System.out.println("String "+strOne+" is a rotation of "+strTwo+" ?:"+isSubString(strOne,strTwo));

	}

}
