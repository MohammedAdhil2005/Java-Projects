import java.util.Arrays;

class p4_moveZerosTotheEnd
{
	public static void main(String[] args) 
	{
		int[] a={10,0,20,0,30,40};
		int[] b=new int[a.length];
		
		int j=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
