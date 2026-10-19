class string26_count14 
{
	public static void main(String[] args) 
	{
		String s="hello, realy.how are you ? iam fine!";
		int count=0;
		for (int i=0;i<s.length();i++ )
		{
			char ch=s.charAt(i);
			if (ch=='!' || ch=='?' || ch=='.' || ch==',' ||ch==';' || ch==':')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
