class string30_count18
{
	public static void main(String[] args) 
	{
		String s="a1b2c3d4";
		int count =0;
		
		
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			if (ch>='0' && ch <='9')
			{
				int n=ch;
				if (n%2!=0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
