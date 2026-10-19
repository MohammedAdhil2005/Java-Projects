class trywithresource implements AutoCloseable
{
	String s="Hey Guyss";
	
	public void close(){
		System.out.println("Resource closed!!!");
	}
	
	public static void main(String[] args) 
	{
		try(trywithresource r=new trywithresource()){
			System.out.println(r.s);
		}
		catch(Exception e){
			//Handling code
		}
		
	}
}
