class string36_count23
{
	public static void main(String[] args) 
	{
		String s="i love java programming";
		String[] a=s.split(" ");
		
		int count=0;
		
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i].length()==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
