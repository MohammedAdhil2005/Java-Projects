class  num24_armstrongnumber
{
public static int count(int n){
	int c=0;
	while(n!=0){
		n=n/10;
		c++;
	}
	return c;
}

public static int pow(int b,int e){
	int powvalue=1;
	for(int i=1;i<=e;i++){
		powvalue=powvalue*b;
	}
	return powvalue;
}

public static void arms(int n,int c){
	int org=n;
	int sum=0;
	
	while(n!=0){
		int last=n%10;
		sum=sum+pow(last,c);
		n=n/10;
	}
	if(sum==org){
		System.out.println("Arms");
	}
	else{
		System.out.println("not Arms");
	}
	
}
	public static void main(String[] args) 
	{
		int n=153;
		int count=count(n);
		arms(n,count);

	}
}

