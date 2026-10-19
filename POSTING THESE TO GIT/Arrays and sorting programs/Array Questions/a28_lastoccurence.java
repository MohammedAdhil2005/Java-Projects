class a28_lastoccurence 
{
	public static void main(String[] args) 
	{
		int[] a = {4,1,4,2,3,2,1,5};
		
		boolean[] visit=new boolean[a.length];
		
		for(int i=0;i<a.length;i++){
			
			if(visit[i]){
				continue;
			}
			
			int lastindex=i;
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					lastindex=j;
					visit[j]=true;
				}
			}
			System.out.println(a[i]+" ---> "+lastindex+" index");
		}
		
	}
}
