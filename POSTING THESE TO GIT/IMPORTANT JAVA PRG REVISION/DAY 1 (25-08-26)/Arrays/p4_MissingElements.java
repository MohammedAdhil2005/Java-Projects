class p4_MissingElements 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,4,8};
		int n=8;
		
		boolean[] res=new boolean[n+1];
		
		for(int num:a){
			res[num]=true;
		}
		
		System.out.println("Missing element are --> ");
		
		for(int i=1;i<n;i++){
			if(!res[i]){
				System.out.print(i+" ");
			}
		}
		
	}
}
