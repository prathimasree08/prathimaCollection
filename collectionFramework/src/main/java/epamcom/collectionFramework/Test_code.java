package epamcom.collectionFramework;

import java.util.*;
public class Test_code {
    public static void main(String[] args) 
    {
    	Collection<Integer> list = new Collection<Integer>();
        boolean b = true;
        Scanner sc =  new Scanner(System.in);
        while(b) {
        	System.out.println("Select your function from (1 - 5)");
        	System.out.println("1. Addition of element to the list");
        	System.out.println("2. Removal of element from the list");
        	System.out.println("3. Size Of the List");
        	System.out.println("4. Access element with index");
        	System.out.println("5. Print list");
        	int c = sc.nextInt();
        	switch(c) {
        	case 1 : 
        		System.out.println("Enter the number to be added");
        		list.addElement(sc.nextInt());
        	System.out.println("If you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		System.out.println("Your List is here!!");
        		b = false;
        		break;
        	}
        	case 2 : 
        		System.out.println("Enter the number to be deleted");
        		list.removeElement(sc.nextInt());
        	System.out.println("If you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		System.out.println("Your List is here!!");
        		b = true;
        		break;
        	} else {
        		b = false;
        		break;
        	}
        	case 3 : System.out.println("The size of list is "+list.size());
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}	
        	case 4 :
        		System.out.println("Enter index : Indexing starts from 0");
        		System.out.println("The element is "+list.getElement(sc.nextInt()));
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}
        	case 5 : System.out.println("The list is "+list);
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}
        	}
        
    }
    }
}
