class jeep 
{
	String jname;
	String jcolor;
	int jprice;
	jengine j;
	
	jeep(String jname,String jcolor,int jprice){
		this.jname=jname;
		this.jcolor=jcolor;
		this.jprice=jprice;
	}
	
	public void jengine(jengine j){
		this.j=j;
	}
}
