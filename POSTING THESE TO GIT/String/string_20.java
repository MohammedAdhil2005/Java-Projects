class string_20 
{
	public static void main(String[] args) 
	{
		// Question: Count Lowercase Letters
         
		String s="Adhil";
		int count=0;
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(ch>='a' && ch<='z'){
				count++;
			}
		}
		System.out.println("\nLowercase letter count are --> "+count);
	}
}

