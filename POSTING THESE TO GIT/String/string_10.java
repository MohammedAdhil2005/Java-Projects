class string_10 
{
	public static void main(String[] args) 
	{
		// PDF Question: Search a Substring and its start index
		
		String str="Helle World";
		String substr="World";
		
		boolean res=false;
		
		
		if(str.length()<substr.length()){
			res=false;
		}
		
		else{
		   for(int i=0;i<=str.length()-substr.length();i++){
			   
			res=true;
			
			for(int j=0;j<substr.length();j++){
				
				if(str.charAt(i+j)!=substr.charAt(j)){
					res=false;
					break;
				}
			}
			
			if(res){
				System.out.println("YES WE HAVE");
				System.out.println("Starting index = " + i);
                break;
			}
			
		   }
		}
		
		if(!res){
			System.out.println("NOT FOUND");
		}
		
	}
}
