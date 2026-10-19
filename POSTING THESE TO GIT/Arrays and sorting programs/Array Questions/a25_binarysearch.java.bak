import java.util.Arrays;
class a25_binarysearch 
{
	public static void main(String[] args) 
	{
		int[]a ={10,20,77,2,15,30,40};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int left=0;
		int right=a.length-1;
		
		int target=20;
		
		boolean ispresent =false;
		
		while(left<=right){
			int mid=(left+right)/2;
			
			if(target==a[mid]){
				ispresent=true;
				break;
			}
			else if(target<a[mid]){
				right=mid-1;
			}
			else{
				left=mid+1;
			}
		}
		
		if(ispresent){
			
			System.out.println("yes we have!!");
		}
		
		else{
			
			System.out.println("nope!!");
		}
	}
}
