class  p41_alphabetleft
{
	public static void main(String[] args) 
	{
		int n=5;
		int star=1;
		int space=n-1;
		
		System.out.println();
		
		char ch='A';
		for(int i=1;i<=n;i++){
			char temp=ch;
			for(int k=1;k<=space;k++){
				System.out.print(" ");
				temp++;
			}
			
			for(int j=1;j<=star;j++){
				System.out.print(temp++);

			}
			System.out.println();
			
			star++;
			space--;
		}
		
	}
}
