package epamcom.collectionFramework;

import java.util.Arrays;
public class Collection<E> {
	private int capacity = 0;
	private static final int INITIAL_CAPACITY = 10;
	private Object numbers[];
	public Collection() {
		numbers = new Object[INITIAL_CAPACITY];
	}
	public void addElement(E e) {
		if (capacity == numbers.length) {
			ensure();
		}
		numbers[capacity++] = e;
	}
	@SuppressWarnings("unchecked")
	public E getElement(int i) {
		if (i >= capacity || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		return (E) numbers[i];
	}
	

	@SuppressWarnings("unchecked")
	public E removeElement(int i) {
		if (i >= capacity || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		Object item = numbers[i];
		int numElts = numbers.length - ( i + 1 ) ;
		System.arraycopy(numbers, i + 1, numbers, i, numElts ) ;
		capacity--;
		return (E) item;
	}
	
	//Get Size of list
	public int size() {
		return capacity;
	}
	
	//Print method
	@Override
	public String toString() 
	{
		 StringBuilder sb = new StringBuilder();
		 sb.append('[');
		 for(int i = 0; i < capacity ;i++) {
			 sb.append(numbers[i].toString());
			 if(i<capacity-1){
				 sb.append(",");
			 }
		 }
		 sb.append(']');
		 return sb.toString();
	}
	
	private void ensure() {
		int newSize = numbers.length * 2;
		numbers = Arrays.copyOf(numbers, newSize);
	}
}
