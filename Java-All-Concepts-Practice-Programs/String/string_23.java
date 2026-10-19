class string_23 
{
	public static void main(String[] args) 
	{
		// Question: Count the number of consonants in a string.
        
		String s="adhil";
		int count=0;
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'){
				count++;
			}
		}
		System.out.println("Consonants counts are --> "+count);
	}
}
