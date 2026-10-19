class a13_firsthalf
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		
		System.out.print("\n First half of an array is ---> ");
		
		for(int i=0;i<a.length/2;i++){
			
			System.out.print(a[i]+" "); // 30 is not needed bcoz its mid 
			
		}
		
		System.out.println();
	}
}
