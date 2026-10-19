import java.io.*;

class FileWriterrr 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("C:\\Users\\amoha\\OneDrive\\Desktop\\QSPIDERS JAVA\\All OOPS Concept Programs\\File Handling\\data.txt");
		
		FileWriter fw=new FileWriter(f);
		
		fw.write("Adhil");
		fw.write(67);
		fw.write("A");
		
		
		fw.flush();
		
		System.out.println("Doneee");
	}
}
