class string_17 
{
	public static void main(String[] args) 
	{
		//Question : Find Index of Every Vowel
		
		String s="adhil";
		
		System.out.println("Indexes are ---> ");
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
				System.out.println(i);
			}
		}
		
	}
}
