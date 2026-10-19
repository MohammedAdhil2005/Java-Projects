import java.util.Scanner;

class ToYoungException extends RuntimeException
{
	ToYoungException(){
		
	}
	
	ToYoungException(String s){
		super(s);
	}
}

class ToOlderException extends RuntimeException
{
	ToOlderException(){
		
	}
	
	ToOlderException(String s){
		super(s);
	}
}


class customExceptions 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the age");
		
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		
		if(age<18){
			throw new ToYoungException("poda thambi");
		}
		
		else if(age>30){
			throw new ToOlderException("Sry paa age overrr");
		}
		
		else{
			System.out.println("Valid to marry");
		}
	}
}
