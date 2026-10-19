class p38_alphabettriangle
{
	public static void main(String[] args) 
	{
		int n=5;
		int star=1;
		int space=n-1;
		char ch='A';
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(ch+" ");
			}
			ch++;
			star++;
			space--;
			System.out.println();
		}
		
	}
}
