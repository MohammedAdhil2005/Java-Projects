class p1_largeandsmallinarray
{
	public static void main(String[] args) 
	{
		int[] a={10, 25, 5, 40, 15};
		int big=a[0];
		int small=a[0];
		
		for(int i=1;i<a.length;i++){
			if(a[i]>big){
				big=a[i];
			}
			if(a[i]<small){
				small=a[i];
			}
		}
		
		System.out.println("Large element is --> "+big);
		System.out.println("Smallest element is --> "+small);
	}
}
