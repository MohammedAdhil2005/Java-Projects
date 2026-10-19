import java.util.Arrays;

class Leet3_reversestring_344 
{
	public static void rev(char[] s){
		
		int left=0;
		int right=s.length-1;
		
		System.out.println("\nORIGINAL string is ---> "+Arrays.toString(s));
		
		while(left<right){
			char temp=s[left];
			s[left]=s[right];
			s[right]=temp;
			
			left++;
			right--;
		}
		
		System.out.println("\nREVERSED string is ---> "+Arrays.toString(s));
	}

	public static void main(String[] args) 
	{
		char[] s ={'h','e','l','l','o'};
		rev(s);
		
	}
}
