import java.util.ArrayList;
import java.util.Iterator;

class ArrayListtt 
{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(1,1.5);
		
		System.out.println("L1 --> "+l1);
		
		System.out.println("-----------------------");
		
		l1.remove((Object)1);
		l1.remove(1.5);
		
		System.out.println("After removed L1 --> "+l1);
		
		
		System.out.println("-----------------------");
		
		ArrayList l2=new ArrayList();
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		l2.add(2,5.5);
		
		System.out.println("L2 --> "+l2);
		
		System.out.println("-----------------------");
		
		
		l2.remove((Object)6);
		System.out.println("After removed L2 --> "+l2);
		
		
		System.out.println("-----------------------");
		
		
		l1.addAll(l2);
		System.out.println("Add all both l1 and l2 --> "+l1);
				
		
		System.out.println("-----------------------");
		
		
		System.out.println("---- Finded by CONTAINS ----");
		  
		 
		if(l1.contains(5)){
			System.out.println("yepp we Haveee");
		}
		else{
			System.out.println("Nope");
		}
		
		
		System.out.println("-----------------------");
		
		ArrayList l3=new ArrayList();
		l3.add(10);
		l3.add(20);
		l3.add(30);
		System.out.println("L3 --> "+l3);
		
		ArrayList l4=new ArrayList();
		l4.add(30);
		l4.add(40);
		l4.add(50);
		System.out.println("L4 --> "+l4);
		
		l3.retainAll(l4);
		System.out.println("Retain all --> "+l3);
		
		l3.removeAll(l4);
		System.out.println("Remove all --> "+l3);
		
	}
}
