class string27_count15 
{
	public static void main(String[] args) 
	{
		String s="hello1234!@#";
		int letters=0;
		int digits=0;
		int splchar=0;
		
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			if ((ch>='a' && ch<='z')||(ch>='a' && ch<='z'))
			{
				letters++;
			}
			else if (ch>='0' && ch<='9')
			{
				digits++;
			}
			else{
				splchar++;
			}
		}
		System.out.println("letters = "+letters);
		System.out.println("digits = "+digits);
		System.out.println("splchar = "+splchar);
	}
}
