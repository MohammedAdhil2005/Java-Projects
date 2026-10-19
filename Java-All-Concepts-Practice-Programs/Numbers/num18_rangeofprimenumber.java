class  num18_rangeofprimenumber
{
	public static boolean rangeofprimenumber(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		return count==2;
		}
		
	public static void printrangeofprimenumber(int n){
		for(int j=1;j<=n;j++){
			if(rangeofprimenumber(j)){
				System.out.println(j+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int num=20;
		printrangeofprimenumber(num);
		
	}
}
