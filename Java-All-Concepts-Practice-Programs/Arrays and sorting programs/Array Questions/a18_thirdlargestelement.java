class  a18_thirdlargestelement
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,40};
		
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(fmax<a[i]){
				tmax=smax;
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i] && a[i]!=fmax){
				tmax=smax;
				smax=a[i];
			}
			else if(tmax<a[i] && a[i]!=smax && a[i]!=fmax){
				tmax=a[i];
			}
			
		}
		System.out.println(tmax);
	}
}
