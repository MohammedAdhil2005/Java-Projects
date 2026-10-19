class  num26_automorphicnumber
{
	public static int count(int n){
		int c=0;
		while(n!=0){
			n=n/10;
			c++;
		}
		return c;
	}
	public static void automorphic(int n){
		int sq=n*n;
		
		int count=count(n);
		int temp=1;
		
		for(int i=1;i<=count;i++){
			temp=temp*10;
		}
			int last=sq%temp;
			
			if(last==n){System.out.println("Automorphic");}
			else{System.out.println("Not automorphic");}
		
	}
	
	public static void main(String[] args) 
	{
		int n=625;
		automorphic(n);
	}
}

