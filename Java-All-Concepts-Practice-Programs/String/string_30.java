class string_30
{
	public static void main(String[] args) 
	{
		// Question: Display the frequency count of every distinct word in a sentence.
		
		String s="cat dog cat bird dog cat";
		
		String[] words=s.split(" ");
		
		for(int i=0;i<words.length;i++){
			
			String word=words[i];
			int freq=0;
			
			
			for(int j=0;j<words.length;j++){
				
				if(word.equals(words[j])){
					freq++;
				}
			}
			
			
			boolean first=true;
			
			for(int k=0;k<i;k++){
				
				if(word.equals(words[k])){
					first=false;
					break;
				}
			}
			
			
			if(first){
				System.out.println(word+" --> "+freq);
			}
		}
	}
}