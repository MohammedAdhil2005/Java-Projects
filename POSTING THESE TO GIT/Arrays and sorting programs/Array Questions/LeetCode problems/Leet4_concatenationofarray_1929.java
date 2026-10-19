import java.util.Arrays;

class Leet4_concatenationofarray_1929  
{
	public static void main(String[] args) 
	{
		int[] a={1,2,1};
		
		System.out.println("\nORG ARRAY ----> "+Arrays.toString(a));
		
		int[] ans=new int[a.length*2];
		
		for(int i=0;i<a.length;i++){
			ans[i]=a[i];
			ans[i + a.length] = a[i];
		}
		
		System.out.println("\nCONCADINATE ARRAY ----> "+Arrays.toString(ans));
	}
}
