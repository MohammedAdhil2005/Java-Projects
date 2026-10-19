class string28_count16 
{
	public static void main(String[] args) 
	{
		String s="hello world java";
		String result="";
		
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			if (ch != ' ')
			{
				result =result+ch;
			}
		}
		System.out.println(result);
	}
}
