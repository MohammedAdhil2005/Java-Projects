class a8_countpositive 
{
		
	public static void pn(int[] a){
		int pn=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				pn++;
			}
		}
		System.out.println("Positive number count is ---> "+pn);
	}
	public static void main(String[] args) 
	{
		int[] a={7,3,5,10,-4,-8};
		pn(a);
	}
}
