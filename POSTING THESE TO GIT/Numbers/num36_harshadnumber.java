class num36_harshadnumber 
{
	public static int harshadnumber(int n){
		int sum=0;
		int org=n;
		
		while(n!=0){
			int last=n%10;
			sum=sum+last;
			n=n/10;
		}
		
		if(org%sum==0){
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		int num=33;
		int res=harshadnumber(num);
		if(res==1){ 
		System.out.println("Harshaddd nummm!!");}
		else{
		System.out.println("Nottt Harshaddd nummm!!");
		}
	}
}
