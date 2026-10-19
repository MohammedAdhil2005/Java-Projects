class subarray_7 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3};
		int min=Integer.MAX_VALUE;
		int start=0,end=0;
				
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
				start=i;
				end=j;
			}
			
			
		}
		
		System.out.println("----------------");
			 
		}
		
		System.out.print("Mininum subarray is --> ");
		
		for(int i1=start;i1<=end;i1++){
			System.out.print(a[i1]+" ");
		}
		
		System.out.println();
		
	}
}
