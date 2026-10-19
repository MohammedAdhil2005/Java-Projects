class string_8 
{
	public static void main(String[] args) 
	{
		
		//PDF Question: Find Last Occurrence of a Character
		
		String s="programming";
		char target='g';
		
		System.out.println("\nLast Occurence using predefined method --> "+s.lastIndexOf(target)+"\n");
		
		for(int i=s.length()-1;i>=0;i--){
			
			char ch=s.charAt(i);
			
			if(ch==target){
				System.out.println("Last Occurence using Manual method --> "+i);
				break;
			}
		}
	}
}
