class a16_secondlargestelement 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,40};
		
		int firstmax=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		
		
		for(int i=0;i<a.length;i++){
			
			if(firstmax<a[i]){
				 secondmax=firstmax;
				 firstmax=a[i];
			}
			
			else if(secondmax<a[i] && a[i]!=firstmax){
				secondmax=a[i];
			}
		}
		System.out.println(secondmax);
	}
}
