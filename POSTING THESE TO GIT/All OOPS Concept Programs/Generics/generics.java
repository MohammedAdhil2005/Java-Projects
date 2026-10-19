class generics <T>
{
	T data;
	
	generics(T data){
		this.data=data;
	}
	
	public T get(){
		return data;
	}
	
	public static void main(String[] args) 
	{
		generics<String> g1=new generics("Adhil");
		
		generics<Integer> g2=new generics(14);
		
		System.out.println(g1.get()+" "+g2.get());
	}
}
