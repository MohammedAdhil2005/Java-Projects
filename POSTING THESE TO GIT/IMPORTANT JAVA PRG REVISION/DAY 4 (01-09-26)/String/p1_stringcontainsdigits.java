class p1_stringcontainsdigits 
{
	public static void main(String[] args) 
	{
		String s="12345";
		boolean present=true;
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(ch<'0' || ch>'9'){
				present = false;
				break;
			}
		}
		if(present){
			System.out.println("yeppp it containsss");
		}
		else{
			System.out.println("Nopeee");
		}
		
	}
}
