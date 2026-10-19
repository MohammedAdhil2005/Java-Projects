class num16_secondsmallestdigit 
{
	public static int secondsmallestdigit(int n){
		int min=10;
		int second=10;
		
		while(n!=0){
			int last=n%10;
			
			if(last<min){
				second=min;
				min=last;
			}
			else if (last<second && last!=min){
				second=last;
			}
			n=n/10;
		}
		
		if(second==10){
			return -1;
		}
		
		return second;
	}
	public static void main(String[] args) 
	{
		int num=153;
		int res=secondsmallestdigit(num);
		if(res == -1){
		System.out.println("no smallest value");
		}else{
		System.out.println(num+" second smallest of digit --> "+res);
		}
	}
}
