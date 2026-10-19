class string34_count21 
{
	public static void main(String[] args) 
	{
		String s="an apple is ou njci";
		String[] a=s.split(" ");
		int count=0;
		
		for (int i=0;i<a.length ;i++ )
		{
			char ch=a[i].charAt(a[i].length()-1);
			if (ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}
