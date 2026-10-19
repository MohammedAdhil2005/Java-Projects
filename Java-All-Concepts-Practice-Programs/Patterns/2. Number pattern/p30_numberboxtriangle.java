class p30_numberboxtriangle 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=i) //1. keela repeated by using < and i || 2. mela repeated > and i 
				{        //3. keela ordered by using < and j || 4. mela ordered by using > and j
					System.out.print(i+" ");
				}
				else{
					System.out.print("1"+" ");
				}
			}
			System.out.println();
		}
		
	}
}
