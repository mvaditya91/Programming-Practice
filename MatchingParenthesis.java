
public class MatchingParenthesis {

	public int top=-1;
	public char[] stack = new char[100];
	
	public static boolean isMatching(char isOpenBrace,char isCloseBrace) {
		if(isOpenBrace=='(' && isCloseBrace==')') return true;
		else if(isOpenBrace=='{' && isCloseBrace=='}') return true;
		else if(isOpenBrace=='[' && isCloseBrace==']') return true;
		else return false;
	}
	
	public boolean isEmpty() {
		if(top==-1) return true;
		else return false;
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("No more elements to compare. Expression unbalanced.");
			return '\0';
		}
		char returnChar = stack[top];
		top = top-1;
		return returnChar;
	}
	public void push(char pushChar) {
		if(top==99) {
			System.out.println("Expression is unbalanced");
			System.exit(0);
		}
		stack[++top] = pushChar;
	}
	
	public static boolean checkBalancedorNot(char[] checkExp) {
		
		MatchingParenthesis matchingorNot = new MatchingParenthesis();
		
		for(int i=0;i<checkExp.length;i++) {
			if( (checkExp[i]=='{') || (checkExp[i]=='[') || (checkExp[i]=='(')) {
				matchingorNot.push(checkExp[i]);
			}
			if( (checkExp[i]=='}') || (checkExp[i]==']')|| (checkExp[i]==')')) {
				if(matchingorNot.isEmpty()) {
					return false;
				} else {
					if(!isMatching(matchingorNot.pop(),checkExp[i])) {
						return false;
					}
				}
			}
		}
		if(matchingorNot.isEmpty()) return true;
		else return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{(()())[]{}{";
		char exp[] = str.toCharArray();
			
			//{'{','(',')','}','[',']'};
		if(checkBalancedorNot(exp)) System.out.println("The expression is balanced");
		else System.out.println("The expression is not balanced properly");

	}

}
