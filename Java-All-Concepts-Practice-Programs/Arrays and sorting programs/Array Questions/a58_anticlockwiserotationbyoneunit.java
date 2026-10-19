import java.util.Arrays;

class  a58_anticlockwiserotationbyoneunit
{
	public static void main(String[] args) 
	{
		
		int[] a={10,20,30};
		
		System.out.println("\nBefore rotaion --> "+Arrays.toString(a));
		
		int temp=a[0];
		
		for(int i=0;i<a.length-1;i++){
			a[i]=a[i+1];
		}
		
		a[a.length-1]=temp;
		
		System.out.println("\nAfter anti clockwise rotaion by 1 unit --> "+Arrays.toString(a));
	}
}
