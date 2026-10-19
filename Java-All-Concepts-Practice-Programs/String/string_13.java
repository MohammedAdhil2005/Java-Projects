class string_13 
{
	public static void main(String[] args) 
	{
		// Question: Find All Positions	of a Character
		
		String s="banana";
		char target='a';
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(ch==target){
				System.out.println(target+" present in --> "+i);
			}
		}
		
	}
}
