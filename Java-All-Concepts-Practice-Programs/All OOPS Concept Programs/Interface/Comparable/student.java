import java.util.Arrays;

class student implements Comparable 
{
	int sid;
	String name;
	
	student(int sid,String name){
		this.name=name;
		this.sid=sid;
	}
	
	public int compareTo(Object o){
		
		student s1=(student)o;
		return this.sid-s1.sid;
		
	}
	
	public static void main(String[] args) 
	{
		student[] s1=new student[2];
		
		s1[0]=new student(02,"Adhil");
		
		s1[1]=new student(01,"Mohammed");
		
		Arrays.sort(s1); //internally called compareTo method 
		
		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i].sid+" "+s1[i].name);
		}
		
	}
}
