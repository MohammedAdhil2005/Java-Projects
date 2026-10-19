import java.util.Arrays;

class  Leet2_Maximumproductoftwoelements_1464 // using indices
{
	public static void max(int[] a){
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				int temp=(a[i] - 1) * (a[j] - 1); // using index
				
				if(temp>max){
					max=temp;
				}
			}
		}
		
		System.out.println(" Given array max value is ----> "+max);
		
	}
	public static void main(String[] args) 
	{
		int[] nums ={3,4,5,2};
		max(nums);
	}
}
