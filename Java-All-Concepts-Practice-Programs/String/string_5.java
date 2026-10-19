class  string_5
{
	public static void main(String[] args) 
	{
		
   /*Question: Write a Java program to find and print all the special characters present in a given String
		       and also count the total number of special characters.*/
			   
			   
		String s="I&Love&_Java";
		
		int count=0;
		
		System.out.print("The special characters are presented in --> ");
		
		for(int i=0;i<s.length();i++){
			
			char ch=s.charAt(i);
			
			if(!(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z') && !(ch>='0' && ch<='9')){
				count++;
				System.out.print(ch+" ");
			}
			
		}
		System.out.println(" Totally -- > "+count);
		
	}
}
