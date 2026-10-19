class  a21_countoccurance
{
	public static void main(String[] args) 
	{
		int[] a={2,3,2,4,3,5,6};
		
		boolean[] visit=new boolean[a.length];
		
		for(int i=0;i<a.length;i++){
			
			if(visit[i]){
				continue;
			}
			
			int count=1;
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					count++;
					visit[j]=true;
				}
			}
			
			System.out.println(a[i]+" ---> "+count);
		}
		
	}
}
