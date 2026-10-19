class  p2_stringcontainsalphabets
{
	public static void main(String[] args) 
	{
		String s="Adhil";
		boolean prs=true;
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))){
				prs=false;
				break;
			}
		}
		if(prs){
			System.out.println("yeppp it containsss");
		}
		else{
			System.out.println("Nopeee");
		}
	}
}
