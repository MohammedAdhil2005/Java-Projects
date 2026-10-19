class  string_25
{
	public static void main(String[] args) 
	{
		// Question: Count Special Characters
		
		String s="I@LOVE*JAVA";
		int count=0;
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(!(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z') && !(ch>='0' && ch<='9')){
				count++;
			}
		}
		System.out.println("Special char count are ---> "+count);
	}
}
