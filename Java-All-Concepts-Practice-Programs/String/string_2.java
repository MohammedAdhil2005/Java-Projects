class string_2 
{
	public static void main(String[] args) 
	{
		
    /*Question: Write a Java program to find and print the indexes 
	            of all non-digit characters present in a given String.*/
		
		
		String s="a1b2c34de";
		
		System.out.println("Chararcter indexes are: \n");
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(ch<'0' || ch>'9'){   // Ascii values is '0' ---> 48 and '9' ---> 57
				System.out.println(i);
			}
		}
		
	}
}
