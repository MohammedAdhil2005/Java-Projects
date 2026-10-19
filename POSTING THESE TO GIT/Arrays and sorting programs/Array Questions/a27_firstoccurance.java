class  a27_firstoccurance
{
	public static void main(String[] args) 
	{
		int[] a = {4,1,4,2,3,2,1,5};
		
		boolean[] visit=new boolean[a.length];
		
		for(int i=0;i<a.length;i++){
			
			if(visit[i]){
				continue;
				
			}
			
			System.out.println(a[i] + " ---> " + i);
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					
					visit[j]=true;
				}
			}
			
		}
		
	}
}
