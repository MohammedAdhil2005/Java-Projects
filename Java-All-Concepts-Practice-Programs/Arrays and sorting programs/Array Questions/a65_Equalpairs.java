class a65_Equalpairs
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,10,30};
		
		System.out.println("\nEqual pairs are--> \n");
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
				System.out.println(a[i]+" found at "+"("+i+" , "+j+")"+" index!!! ");
				}
			}
		}
		
	}
}
