class  num29_sunnynumber
{
	public static void sunnynumber(int n){
		int add=n+1;
		boolean sunny=false;
		
		for(int i=1;i<=add;i++){
			if(i*i==add){
				sunny=true;
				break;
			}
		}
		if(sunny){
			System.out.println("Sunny");
		}
		else{
			System.out.println("Not Sunny");
		}
		
	}
	public static void main(String[] args) 
	{
		int num=3;
		sunnynumber(num);
	}
}
