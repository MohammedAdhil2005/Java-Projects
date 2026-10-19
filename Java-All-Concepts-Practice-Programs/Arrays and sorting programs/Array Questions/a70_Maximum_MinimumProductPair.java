class  a70_Maximum_MinimumProductPair
{
	public static void maxproduct(int[] a){
		int max=Integer.MIN_VALUE;
		int first=0;
		int last=0;
		
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int temp=a[i]*a[j];
				
				if(max<temp){
					max=temp;
					first=a[i];
					last=a[j];
				}
			}
		}
		System.out.print("\nMaximum value and product pairs are ---> "+max+" and");
		System.out.println(" ("+first+" , "+last+")");
		
		System.out.println("\n------------------------------------ \n");
		
	}
	
	
	
	
	public static void minproduct(int[] a){
		int min=Integer.MAX_VALUE;
		int first=0;
		int last=0;
		
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int temp=a[i]*a[j];
				
				if(min>temp){
					min=temp;
					first=a[i];
					last=a[j];
				}
			}
		}
		System.out.print("\nMinimum value and product pairs are ---> "+min+" and");
		System.out.println(" ("+first+" , "+last+")\n");
		
		System.out.println("\n------------------------------------ \n");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int[] a = {-10, -20, 5, 6};
		maxproduct(a);
		minproduct(a);
		
	}
}
