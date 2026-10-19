class num40_perfectnumber 
{
	public static boolean perfectnumber(int n){
		int sum=0;
		
		for(int i=1;i<n;i++){
			if(n%i==0){
			sum=sum+i;}
		}
		return sum==n;
	}
	public static void main(String[] args) 
	{
		int n=6;
		boolean res=perfectnumber(n);
		if(res){
		System.out.println("Perfecttttt!");}
		else{
		System.out.println("Notttt Perfecttttt!");	
		}
	}
}
