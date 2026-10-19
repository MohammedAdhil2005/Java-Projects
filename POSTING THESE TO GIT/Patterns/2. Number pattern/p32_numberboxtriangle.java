class p32_numberboxtriangle 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j>=i){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}
}
