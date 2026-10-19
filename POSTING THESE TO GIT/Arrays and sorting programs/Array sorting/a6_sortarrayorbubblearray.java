import java.util.Arrays;
class a6_sortarrayorbubblearray 
{
	public static void main(String[] args) 
	{
		int[] a={5,3,4,8,2};
		
		
		System.out.println("Before sorted ---> "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("\nAfter sorted ---> "+Arrays.toString(a));
	}
}
