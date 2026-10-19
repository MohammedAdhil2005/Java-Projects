class string33_count20 
{
	public static void main(String[] args) 
	{
		String s="an apple is an orange";
		String[] a=s.split(" ");
		int count=0;
		
		for (int i=0;i<a.length ;i++ )
		{
			char ch=a[i].charAt(0);
			if (ch=='a' ||ch=='e' || ch=='i' ||ch=='o'||ch=='u' )
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
