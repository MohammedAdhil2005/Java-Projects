class  p2_palindromeString
{
	public static void main(String[] args) 
	{
		String s="madam";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			
			rev=rev+ch;
		}
		
		if(s.equals(rev)){
			System.out.println("Its palindromeee!!");
		}
		else{
			System.out.println("Nopeeee Its palindromeee!!");
		}
		
	}
}
