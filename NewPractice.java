import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

class Nodes {
	Nodes left;
	Nodes right;
	int data;
	public Nodes(int value) {
	data = value;
	left = null;
	right = null;
	}
}

public class NewPractice {
	
	Nodes root;
	boolean found;
	int count=0;
	
	public int findSmallest(Nodes element) {
		int returnValue=0;
		while(element.left!=null) {
			element = element.left;
		}
		returnValue = element.data;
		return returnValue;
	}
	
	public Nodes deleteElement(Nodes element,int key) {
		if(element==null) return null;
		if(element.data == key) {
			found=true;
			if(element.left==null && element.right==null) return null;
			if(element.left==null) return element.right;
			if(element.right==null) return element.left;
			int smallest = findSmallest(element.right);
			element.data = smallest;
			element.right = deleteElement(element.right,smallest);
		}else if(key<element.data) {
			element.left = deleteElement(element.left, key);
		}else if(key>element.data) {
			element.right = deleteElement(element.right, key);
		} 
		return element;
	}
	
	public Nodes addElement(Nodes element,int value) {
		if(element == null)  {
			return (new Nodes(value));
		} 
		if(value<element.data) {
			element.left = addElement(element.left, value);
		}
		if(value>element.data) {
			element.right = addElement(element.right,value);
		}
		if(found) System.out.println("Element present in the array");
		
		return element;
	}
	
	public void add(int value) {
		root = addElement(root,value);
	}
	public void visit(int value) {
		System.out.println(value);
	}
	public void dfs(Nodes element,int key) {
		if(element!=null) {
	    dfs(element.left,key);
	    dfs(element.right,key);
	    if(element.data == key) count++;
		}
	}
	
	public void dfs_nonRecursive(Nodes element,int key) {
		if(element==null) return;
		Stack<Nodes> stackOne = new Stack<Nodes>();
		Stack<Nodes> stackTwo = new Stack<Nodes>();
		stackOne.push(element);
		while(!stackOne.isEmpty()) {
			Nodes current = stackOne.pop();
			stackTwo.push(current);
			if(current.left!=null) stackOne.push(current.left);
			if(current.right!=null)stackOne.push(current.right);
		}
	}
	
	public void bfs_nonRecusrive(Nodes element,int key) {
		if(element==null) return;
		Queue<Nodes> newElement = new LinkedList<Nodes>();
		newElement.add(element);
		while(!newElement.isEmpty()) {
			Nodes current = newElement.remove();
			if(current.left!=null) newElement.add(current.left);
			if(current.right!=null) newElement.add(current.right);
		}
	}
	
	public static void main(String[] args) {
	NewPractice impl = new NewPractice();
	impl.add(10);
	impl.add(0);
	impl.add(-10);
	impl.add(-20);
	impl.add(20);
	impl.add(25);
	impl.add(18);
	int key = -100;
	impl.dfs_nonRecursive(impl.root, key);

	}
}
