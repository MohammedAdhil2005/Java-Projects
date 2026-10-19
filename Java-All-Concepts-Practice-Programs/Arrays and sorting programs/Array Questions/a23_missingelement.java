class a23_missingelement 
{
	public static void miss(int[] a){
		
		int n=4;
		boolean[] res=new boolean[n+1];
		
		
		for(int num:a){
			res[num]=true;
		}
		
		for(int i=1;i<n;i++){
			if(!res[i]){
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] a={1,2,4};
		miss(a);
	}
}
