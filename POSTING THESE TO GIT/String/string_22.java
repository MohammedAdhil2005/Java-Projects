class  string_22
{
	public static void main(String[] args) 
	{
		// Question: Count the number of vowel characters in a string.
		
        String s="a1b2c3d4";
		int count=0;
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
				count++;
			}
		}
		System.out.println("Vowel counts are --> "+count);
	}
}
 

