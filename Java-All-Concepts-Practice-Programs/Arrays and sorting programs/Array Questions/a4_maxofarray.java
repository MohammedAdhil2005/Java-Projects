import java.util.Arrays;
class a4_maxofarray
{
	
	public static int max(int[] a){
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) 
	{
		int[] a={10,20,40,88,2};
		System.out.println("The given array is -----> "+Arrays.toString(a));
		
		int res=max(a);
		System.out.println("\nMaximum value of given arrays is -----> "+res);
	}
}
