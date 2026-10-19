class num22_perfectnumber 
{
	public static void perfect(int n){
		int sum=0;
		
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println("yepppp its -->>"+sum);
		}
		else{
			System.out.println("nope");
		}
	}
	public static void main(String[] args) 
	{
		int num=6;
		perfect(num);
	}
}
