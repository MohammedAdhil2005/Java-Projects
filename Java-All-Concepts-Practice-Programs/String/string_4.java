class string_4 
{
	public static void main(String[] args) 
	{
		
	/* Question: Write a Java program to find and print the indexes of
	             all vowel characters present in a given String.*/
				 
				 
		String s="hello";
		
		System.out.println("The vowels in the give String indexes are: ");
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				System.out.println(i);
			}
		}
		
	}
}
