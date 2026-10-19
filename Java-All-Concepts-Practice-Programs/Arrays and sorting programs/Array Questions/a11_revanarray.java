import java.util.Arrays;
class a11_revanarray 
{
	public static void rev(int[] a){
		
	     int[] rev=new int[a.length];
		 int j=a.length-1;
		 
		 for(int i=0;i<a.length;i++){
			rev[j]=a[i];
			j--;
		 }
		 
		 System.out.println(Arrays.toString(rev));
	}
	
	public static void main(String[] args) 
	{
		int[] a={10,20,30};
		rev(a);
		
	}
}
