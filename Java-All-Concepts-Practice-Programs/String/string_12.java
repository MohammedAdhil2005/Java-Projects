class  string_12
{
	public static void main(String[] args) 
	{
		
		// Question: Count Occurrence of a Word
		
		String str="the cat sat	on the mat the cat ran";
		String substr="thee";
		
		boolean flag=false;
		
		int count=0;
		
		if(str.length()<substr.length()){
			flag=false;
		}
		else{
		    for(int i=0;i<=str.length()-substr.length();i++){
			   
			   flag=true;
			   
			   for(int j=0;j<substr.length();j++){
				   
				  if(str.charAt(i+j)!=substr.charAt(j)){
					  
					 flag=false;
					 break;
				  }
			   }
			   
			   if(flag){
                   count++;
		       }
			   
		    }
		}
		
		System.out.println("Ouccured "+count+" times!!");
	}
}
