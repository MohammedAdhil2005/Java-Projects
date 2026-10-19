import java.io.*;

class BufferedWriterrr 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("C:\\Users\\amoha\\OneDrive\\Desktop\\QSPIDERS JAVA\\All OOPS Concept Programs\\File Handling\\data.txt");
		
		FileWriter fw=new FileWriter(f);
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Adhil");
		bw.write(67);
		bw.write("A");
		
		bw.flush();
		
		System.out.println("Doneee");
	}
}
