import java.util.*;

public class charSearch {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int freq[]=new int[200];
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			for(int j='a';j<'z';j++){
				if(ch==j){
					freq[j]+=1;
				}
			}
		}
		
		for(int j=0;j<200;j++){
			if(freq[j]!=0){
				char c=(char) j;
				System.out.println(c+":"+freq[j]);
			}
		}
		
	}
}
