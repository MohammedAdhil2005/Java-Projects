class exception_propagation 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.out.println("Start");
		m1();
		System.out.println("\nStop");
	}
	
	public static void m1() throws InterruptedException
	{
		for(int i=1;i<=5;i++){
		    Thread.sleep(1000);
			System.out.print(i);
		}
	}
}
