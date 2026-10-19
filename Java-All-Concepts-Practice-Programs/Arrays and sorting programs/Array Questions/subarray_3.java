class subarray_3 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3};
		
		
		for(int i=0;i<a.length;i++){
			int sum=0;
			for(int j=i;j<a.length;j++){
				for(int k=i;k<=j;k++){
					System.out.print(a[k]+" ");
				}
				sum=sum+a[j];
				System.out.println(" --- + ---> "+sum);
			}
			System.out.println("------------");
		}
		
	}
}
