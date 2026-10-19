import java.util.Arrays;

class  a60_mergeoftwoarray 
{
	public static void main(String[] args) 
	{
		int[] a={10,20};
		int[] b={30,40};
		
		int[] res=new int[a.length+b.length];
		
		int index=0;
		
		for(int i=0;i<a.length;i++){
			res[index++]=a[i];
		}
		
		for(int j=0;j<b.length;j++){
			res[index++]=b[j];
		}
		
		System.out.println(Arrays.toString(res));
	}
}
