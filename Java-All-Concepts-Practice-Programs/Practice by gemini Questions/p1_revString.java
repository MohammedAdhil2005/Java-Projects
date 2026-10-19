import java.util.Arrays;

class p1_revString 
{
	public static void main(String[] args) 
	{
		String a="Adhil";
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--){
			char ch=a.charAt(i);
			
		if(a.equals(rev)){
		System.out.println(rev);
		}	
			rev=rev+ch;
			
		
		}
		
		
	}
}
