class subarray_5 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3};
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++){
			int sum=0;
			
			for(int j=i;j<a.length;j++){
				
				for(int k=i;k<=j;k++){
					
					System.out.print(a[k]+" ");
				}
				
				sum=sum+a[j];
				System.out.println(" ----> "+sum);
				
				if(sum<min){
					min=sum;
				}
				
			}
			System.out.println("--------------");
		}
		
		System.out.println("\nTHE Minimum Subarray is ----> "+min);
	}
}
