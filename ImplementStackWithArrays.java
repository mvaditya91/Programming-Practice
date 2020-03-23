import java.io.PushbackInputStream;


public class ImplementStackWithArrays {
	
	static int stackSize = 10;
	int top = -1;
	int[] stack = new int[stackSize];
	
	boolean isEmpty() {
		return (top<0);
	}
	
	boolean push(int insertElement) {
		if(top>=(stackSize-1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			stack[++top] =  insertElement;
			System.out.println(insertElement+" pushed into stack");
			return true;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack overflow");
			return 0;
		} else {
			int poppedElement = stack[top--];
			return poppedElement;
		}
	}
	
	int peek() {
		if(top<0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int x = stack[top];
			return x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ImplementStackWithArrays operateStack = new ImplementStackWithArrays();
	for(int i=0;i<stackSize;i++) {
	operateStack.push(i);
	}
	for(int j=0;j<stackSize;j++) {
		System.out.println(operateStack.pop()+" popped out of stack");
	}
	

	}

}
