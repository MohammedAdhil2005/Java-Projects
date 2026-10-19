class string31_count19
{
	public static void main(String[] args) 
	{
		String s="banana";
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			boolean already_counted=false;
			
			//to chech already counted or not
			for (int j=0;j<i ;j++ )
			{
				if (s.charAt(j)==ch)
				{
					already_counted=true;
					break;
				}
			}
			//if not count lets count
			if (already_counted==false)
			{
			int count=0;
			for (int j=0;j<s.length() ;j++ )
			{
				
				if (s.charAt(j)==ch)
				{
					count++;
				}
			}
			if (count>1)
			{
			
			System.out.println("count of"+ch+" is ="+count);
			}
			}
		}
	}
}
