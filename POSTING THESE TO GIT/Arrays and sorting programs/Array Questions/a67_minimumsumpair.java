class a67_minimumsumpair 
{
	public static void main(String[] args) 
	{
		int[] a = {10, 25, 15, 40, 30};
		
		int min=Integer.MAX_VALUE;
		int first=0;
		int last=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int temp=a[i]+a[j];
				
				if(min>temp){
					min=temp;
					first=a[i];
					last=a[j];
				}
			}
		}
		
		System.out.print("\nMinimun value and sum pairs are ---> "+min+" and");
		System.out.println(" ("+first+" , "+last+")");
	}
}
