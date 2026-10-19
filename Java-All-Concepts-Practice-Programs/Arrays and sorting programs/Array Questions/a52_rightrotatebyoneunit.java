import java.util.Arrays;

class a52_rightrotatebyoneunit 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30};
		
		System.out.println("\nBefore rotation --> "+Arrays.toString(a));
		
		int temp=a[a.length-1];
		
		for(int i=a.length-1;i>0;i--){
			a[i]=a[i-1];
		}
		
		a[0]=temp;
		
		System.out.println("\nAfter right rotaion by 1 unit --> "+Arrays.toString(a));
	}
}
