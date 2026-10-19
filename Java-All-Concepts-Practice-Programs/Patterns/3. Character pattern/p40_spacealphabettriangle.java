class p40_spacealphabettriangle 
{
	public static void main(String[] args) 
	{
		int n=5;
		int star=1;
		int space=n-1;
		
		char ch='E';
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++){
				if(j==1||j==star){
				System.out.print(ch);
				}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
			ch--;
			star+=2;
			space--;
		}
		
		star=n*2-3;
		space=1;
		ch='B';
		
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++){
				if(j==1||j==star){
				System.out.print(ch);
				}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
			ch++;
			star-=2;
			space++;
		}
		
		
	}
}
