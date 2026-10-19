import java.util.Arrays;
class a5_minofarray
{
	
	public static int min(int[] a){
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) 
	{
		int[] a={10,20,40,88,2};
		System.out.println("The given array is -----> "+Arrays.toString(a));
		
		int res=min(a);
		System.out.println("\nMaximum value of given arrays is -----> "+res);
	}
}
