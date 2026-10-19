class  a30_checkelementexist
{
	public static void main(String[] args) 
	{
		int[] a={1,4,5,2,8,7};
		
		int target=7;
		boolean ispresent=false;
		
		for(int i=0;i<a.length;i++){
			if(a[i]==target){
				ispresent=true;
			}
		}
		
		if(ispresent){
			System.out.println("\nYes we have this number ---> "+target);
		}
		else{
			System.out.println("\nNope didn't have this number ---> "+target);
		}
	}
}
