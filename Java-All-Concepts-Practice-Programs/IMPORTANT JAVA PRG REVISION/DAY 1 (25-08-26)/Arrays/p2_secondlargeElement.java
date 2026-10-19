class p2_secondlargeElement 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,4,5,2};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(fmax<a[i]){
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i] && a[i]!=fmax){
				smax=a[i];
			}
		}
		
		System.out.println("Second max is ---> "+smax);
		
	}
}
