class  a22_targetvalueofindex
{
	public static void target(int[] a){
		int target=400;
		int index=-1;
		
		for(int i=0;i<a.length;i++){
			//index++;
			if(a[i]==target){
				index=i;    //System.out.println(target+" this value index is --> "+index);
				break;
			}
			
		}
		if(index!=-1){
			System.out.println(target+" this value index is --> "+index);
		}
		else{
			System.out.println(target+" --- this value is not found");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] a={10,40,30,40};
		target(a);
	}
}
