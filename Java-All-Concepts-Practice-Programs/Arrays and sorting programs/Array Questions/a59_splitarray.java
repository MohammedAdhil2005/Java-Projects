import java.util.Arrays;

class  a59_splitarray
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40};
		
		int half=a.length/2;
		
		for(int i=0;i<half;i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.print("|Splitted|");
		
		for(int i=half;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
