class string_18 
{
	public static void main(String[] args) 
	{
		// Question: Find Index of Every Digit
		
		String s="a1b2c3d4e656";
		
		System.out.println("Indexes of digits are  ---> ");
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(ch>='0' && ch<='9'){
				System.out.println(i);
			}
		}
		
	}
}
