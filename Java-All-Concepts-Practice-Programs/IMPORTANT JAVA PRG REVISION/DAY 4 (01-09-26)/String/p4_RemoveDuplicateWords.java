class p4_RemoveDuplicateWords
{
	public static void main(String[] args) 
	{
		String s="this is a worlds that is a reality";
		
		String[] res=s.split(" ");
		
		for(int i=0;i<res.length;i++)
		{
			boolean duplicate=false;
			
			for(int j=0;j<i;j++)
			{
				if(res[i].equals(res[j]))
				{
					duplicate=true;
					break;
				}
			}
			
			if(!duplicate)
			{
				System.out.print(res[i]+" ");
			}
		}
	}
}
