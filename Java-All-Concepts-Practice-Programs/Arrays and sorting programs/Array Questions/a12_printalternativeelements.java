import java.util.Scanner;

class a12_printalternativeelements 
{
	static Scanner sc=new Scanner(System.in);
		
	public static void addarray(int[] a){
		for(int i=0;i<a.length;i++){
			
			System.out.print("\n  "+(i+1)+". ");
			a[i]=sc.nextInt();
	
		}
	}
	
	public static void alter(int[] a){
		
		System.out.println("\n\n  The alternative elements are ---! ");
		
		for(int i=0;i<a.length;i+=2){
			
			System.out.println("\n  "+(i+1)+". values is --> "+a[i]);
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		System.out.print("\n  Enter the Size of an array -----> ");
		int size=sc.nextInt();
			
		System.out.println("\n\n  Enter the Arrays Elements to add -----> ");
		int[] a=new int[size];
		addarray(a);
		
		alter(a);
	}
}
