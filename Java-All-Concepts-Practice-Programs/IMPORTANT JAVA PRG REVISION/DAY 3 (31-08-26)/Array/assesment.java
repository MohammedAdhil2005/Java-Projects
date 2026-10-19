class  assesment
{
	public static void main(String[] args) 
	{
		int[] a={3,4,5,1,2,6,7,8};

		int fmin=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(a[i]<fmin){
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin && a[i]!=fmin){
				smin=a[i];
			}
		}
		System.out.println("Second min value is ---> "+smin);
	}
}
