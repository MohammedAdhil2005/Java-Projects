class string_6 
{
	
  /*Question: Write a Java program to find and print the indexes of all digit characters present in a 
              given String and also count the total number of digits.*/
		
			  
	public static void number(String s,int count){
		
		System.out.print("\nthe index of the given numbers are --> ");
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(ch>='0' && ch<='9'){
				System.out.print(i+", ");
				count++;
			}
		}
		
		System.out.print("in "+count+" Positions!!!");
		
	}
	
	
	
  /*Question: Write a Java method to find and print the indexes of all non-digit characters (letters) present
	            in a given String and also count the total number of such characters.*/
				
				
				
	public static void letter(String s,int count){
		
		System.out.print("\nthe index of the given Letters are --> ");
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(ch<'0' || ch>'9'){
				System.out.print(i+", ");
				count++;
			}
		}
		
		System.out.print("in "+count+" Positions!!!\n");
		
	}
	
	
	
	public static void main(String[] args) 
	{
		String s="a1b2c3d4";
		int count=0;
		
		number(s,count);
		letter(s,count);
	}
}
