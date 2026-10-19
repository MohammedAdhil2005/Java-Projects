class  p1_RevString
{
	public static void main(String[] args) 
	{
		String s="Java";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			
			rev=rev+ch;
		}
		System.out.println("Reverse is --> "+rev);
	}
}
