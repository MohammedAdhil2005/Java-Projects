class  num21_sumoffactornumbers
{
	public static int sumoffactornumbers(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int num=12;
		int res=sumoffactornumbers(num);
		System.out.println(res);
	}
}
