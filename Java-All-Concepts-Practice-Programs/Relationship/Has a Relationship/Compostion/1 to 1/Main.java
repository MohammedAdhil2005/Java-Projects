class Main 
{
	public static void main(String[] args) 
	{
		car c1=new car("BMW","black",500);
		
		System.out.println("\nCar addres ---> "+c1);
		
		System.out.println("\nCar name ---> "+c1.cname+ "\nCar color ---> "+c1.color+"\nCar price ---> "+c1.cprice);
		
		System.out.println("\nTyre addres ---> "+c1.t);
		
		
		System.out.println();
		
		for(int i=0;i<c1.t.length;i++){
			System.out.println("Tyre ----- "+ (i+1));
			System.out.println("\nTyre name ---> "+c1.t[i].tname+"\nTyre price ---> "+c1.t[i].tprice);
			System.out.println();
		}
	}
}
