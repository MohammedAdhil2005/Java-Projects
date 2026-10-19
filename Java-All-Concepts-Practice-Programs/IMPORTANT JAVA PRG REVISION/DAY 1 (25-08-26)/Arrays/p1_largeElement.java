class p1_largeElement 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,4,5,6};
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.print("Greater value is ---> "+max);
	}
}
