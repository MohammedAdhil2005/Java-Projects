class a64_allpaircombinations
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30};
		
		System.out.println("\nPairs are--> \n");
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				System.out.println("("+a[i]+" , "+a[j]+")");
			}
		}
		
	}
}
