import java.rmi.dgc.Lease;

class Nodee {
	Nodee left;
	Nodee right;
	int data;
	public Nodee(int value) {
	data = value;
	left = null;
	right = null;
	}
}

public class BinaryTree {

	Nodee root;
	int smallest;
	
	public int findSmallest(Nodee root) {
		if(root!=null){
		while(root.left!=null) {
			root = root.left;
		}
		}
		smallest = root.data;
		return smallest;
	}
	
	public Nodee deleteNode(Nodee root,int key) {
		if(root==null) return root;
		
		if(key == root.data) {
			if(root.left==null && root.right==null) return null;
			if(root.left==null) return root.right;
			if(root.right==null) return root.left;
			int smallestValue = findSmallest(root.right);
			root.data = smallestValue;
			root.right = deleteNode(root.right,smallestValue);
		}
		if(key<root.data) {
			root.left = deleteNode(root.left,key);
		}
		root.right = deleteNode(root.right,key);
		return root;
	}
	
	public void listElements(Nodee root) {
		if(root!=null) {
			System.out.println(root.data);
			listElements(root.left);
			listElements(root.right);
		}
	}
	
	public boolean containsNodeRecursive(Nodee element,int key) {
		if(element == null) return false;
		
		if(element.data == key) return true;
		if(element.data>key) return containsNodeRecursive(element.left,key);
		if(element.data<key) return containsNodeRecursive(element.right, key);
		
		return false;
	}
	
	public Nodee addElement(Nodee element,int value) {
		if(element==null) {
			return (new Nodee(value));
		}
		if(value<element.data) {
			element.left = addElement(element.left,value);
		}
		if(value>element.data) {
			element.right = addElement(element.right,value);
		}
		return element;
	}
	
	public void add(int value) {
		root = addElement(root,value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bTree = new BinaryTree();
		bTree.add(10);
		bTree.add(0);
		bTree.add(-5);
		bTree.add(-10);
		bTree.add(20);
		bTree.add(18);
		bTree.add(25);
		boolean isTrue = bTree.containsNodeRecursive(bTree.root, 18);
		if(isTrue) System.out.println("Element Exists");
		else System.out.println("Element does not exist");
		bTree.listElements(bTree.root);
		int elementToDelete = 10;
		boolean shouldProceed = bTree.containsNodeRecursive(bTree.root,elementToDelete);
		if(shouldProceed) 
		bTree.root = bTree.deleteNode(bTree.root, elementToDelete);
		else System.out.println("Element to delete not present in the array");
		System.out.println("New List of Elements");
		bTree.listElements(bTree.root);
	}

}
