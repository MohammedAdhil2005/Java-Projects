import java.util.Arrays;

class a56_reverseafterrightrotation  
{
	public static void main(String[] args) 
	{
		
		int[] a={10,20,30};
		
		System.out.println("\nBefore rotaion --> "+Arrays.toString(a));
		
		int temp=a[a.length-1];
		
		for(int i=a.length-1;i>0;i--){
			a[i]=a[i-1];
		}
		
		a[0]=temp;
		
		System.out.println("\nAfter right rotaion by 1 unit --> "+Arrays.toString(a));
		
		
		int[] rev=new int[a.length];
		
		int last=a.length-1;
		
		for(int i=0;i<a.length;i++){
			rev[last]=a[i];
			last--;
		}
		
		System.out.println("\nReversed right rotation by 1 unit --> "+Arrays.toString(rev));
		
		
	}
}
