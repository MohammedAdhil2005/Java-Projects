class string37_count24
{
	public static void main(String[] args) 
	{
		String s="ilove\njava\nprogramming";
		
		
		int count=1;
		
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			if (ch=='\n')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
