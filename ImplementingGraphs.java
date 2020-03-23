import java.util.Arrays;

class Nodem {
	Nodem next;
	Nodem prev;
	int data;
	public Nodem(int value) {
		next = null;
		prev = null;
		data = value;
	}
}

public class ImplementingGraphs {

	Nodem first,temp,last,current, newElement;
	int tempValue;
	boolean canDelete;
	
	public Nodem deleteElement(Nodem remElement,int value) {
		if(remElement == null) return null;
		else {
		if(value!=remElement.data) {
			current = remElement;
			remElement.next = deleteElement(remElement.next,value);
		}
		else {
			
			if(remElement.next!=null) {
				if(current==null)  {
					newElement = remElement.next;
					newElement.prev = null;
					return newElement;
					
				} else {
				newElement = remElement.next;
				current.next = newElement;
				newElement.prev = current;
				return newElement;
				}
			} else {
				newElement = remElement.next;
				current.next = newElement;
				return newElement;
			}
		}
		return remElement;
		}
	}
	
	public Nodem addElement(Nodem element,int value) {
		if(element == null) {
			return (new Nodem(value));
		} else {
			element.next = addElement(element.next,value);
			element.next.prev = element;
		}
		return element;
	}
	
	public void add(int value) {
		first = addElement(first,value);
	}
	
	public void listElements() {
		while(first!=null) {
			last = first;
			System.out.println(first.data);
			first = first.next;
		}
		
		System.out.println("Reverse Elements");
		while(last!=null) {
			System.out.println(last.data);
			last = last.prev;
		}
	}
	
	public static void main(String[] args) {
		
		ImplementingGraphs impl = new ImplementingGraphs();
		impl.add(1);
		impl.add(2);
		impl.add(3);
		impl.add(4);
		impl.add(5);
		
		impl.first = impl.deleteElement(impl.first,5);
		impl.listElements();
	}
	
}
