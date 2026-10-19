import java.util.Arrays;
class a20_swapfirstandlastelement 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,22,40};
		
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
			
		System.out.println(Arrays.toString(a));
	}
}
