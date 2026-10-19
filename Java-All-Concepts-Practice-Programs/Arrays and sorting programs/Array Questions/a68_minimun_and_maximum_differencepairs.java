class a68_minimun_and_maximum_differencepairs 
{
	public static void mindifference(int[] a){
		int min=Integer.MAX_VALUE;
		int first=0;
		int last=0;
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				int temp=Math.abs(a[i]-a[j]);
				
				
				if(min>temp){
					min=temp;
					first=a[i];
					last=a[j];
				}
			}
		}
		
		System.out.print("\nMinimum value and difference pairs are ---> "+min+" and");
		System.out.println(" ("+first+" , "+last+")");
		
		System.out.println("\n------------------------------------ \n");
	}
	
	
	
	public static void maxdifference(int[] a){
		int max=Integer.MIN_VALUE;
		int first=0;
		int last=0;
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				int temp=Math.abs(a[i]-a[j]);
				
				if(max<temp){
					max=temp;
					first=a[i];
					last=a[j];
				}
			}
		}
		
		System.out.print("\nMaximum value and difference pairs are ---> "+max+" and");
		System.out.println(" ("+first+" , "+last+")\n");
		
	}
	
	
	public static void main(String[] args) 
	{
		int[] a = {4, 9, 1, 32, 13};
		mindifference(a);
		maxdifference(a);

	}
}
