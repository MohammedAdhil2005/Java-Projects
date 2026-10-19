class  p36_alphabetright
{
	public static void main(String[] args) 
	{
		int n=5;
		int star=1;
		
		System.out.println();
		
		for(int i=1;i<=n;i++){
			
			int ascii=65;                        // OR char ch='A';
			
			for(int j=1;j<=star;j++){
				
				System.out.print((char)ascii++); // OR ch++;
				
			}
			star++;
			
			System.out.println();
		}
		
	}
}
