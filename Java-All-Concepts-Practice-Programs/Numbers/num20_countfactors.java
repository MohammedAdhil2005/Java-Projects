class  num20_countfactors
{
	public static void countfactors(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		System.out.print(count);
	}
	
	public static void main(String[] args) 
	{
		int num=12;
		countfactors(num);
	}
}
