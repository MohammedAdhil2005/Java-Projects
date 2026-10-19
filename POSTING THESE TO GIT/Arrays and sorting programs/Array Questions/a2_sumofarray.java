class a2_sumofarray
{
	public static void sum(int[] a){
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		
		System.out.println("Sum of the given Array is --> "+sum);
	}
	
	public static void main(String[] args) 
	{
		int[] a={10,20,30};
		sum(a);
		
		
	}
}
