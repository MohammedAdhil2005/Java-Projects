class a3_countprime
{
	public static boolean prime(int n){
		int count=0;
		
		if(n<=1){
			return false;
		}
		
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		return count==2;
	}
	
	public static int Arrayprimecount(int[] a){
		int primecount=0;
		
		for(int i=0;i<a.length;i++){
			if(prime(a[i])){
				primecount++;
			}
		}
		return primecount;
	}
	
	
	public static void main(String[] args) 
	{
		int[] a={0,7,5,3,9};
		int res=Arrayprimecount(a);
		
		System.out.println("Prime count of Given array is ---> "+res);
	}
}
