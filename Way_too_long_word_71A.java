import java.util.*;

public class Way_too_long_word_71A {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=1&&n<=100){
			String[] words=new String[n];
			String[] main=new String[n];
			int[] substrlen=new int[n];
			String[] substr=new String[n];
			for(int i=0;i<n;i++){
				words[i]=sc.next();
				if(words[i].length()>10){
					int count=words[i].length();
					substr[i] = words[i].substring(1,count-1);
					substrlen[i]=substr[i].length();
					main[i]=(words[i].charAt(0))+Integer.toString(substrlen[i])+(words[i].charAt(substrlen[i]+1));
				}
				else
				{
					main[i]=words[i];
				}
				
					
			}
			
			for(int z=0;z<n;z++){
					System.out.println(main[z]);
			}
		}
	}
}
