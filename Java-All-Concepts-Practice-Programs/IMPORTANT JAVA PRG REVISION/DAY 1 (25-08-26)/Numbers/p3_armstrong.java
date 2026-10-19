class p3_armstrong 
{
	public static int count(int n){
		int count=0;
		
		while(n!=0){
			n=n/10;
			count++;
		}
		return count;
	}
	
	public static int pow(int b,int e){
		int powvalue=1;
		
		for(int i=1;i<=e;i++){
			powvalue=powvalue*b;
		}
		
		return powvalue;
	}
	
	public static boolean arms(int n,int c){
		int org=n;
		int sum=0;
		
		while(n!=0){
			int last = n%10;
			sum=sum+pow(last,c);
			n=n/10;
		}
		
		return org==sum;
	}
	
	public static void main(String[] args) 
	{
		int n=153;
		int count=count(n);
		
		boolean res=arms(n,count);
		
		if(res){
			System.out.println("Armstrong!!");
		}
		else{
			System.out.println("Not Armstrong!!");
		}
		
	}
}
