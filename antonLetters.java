import java.util.*;

public class antonLetters {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.replaceAll("[{,} ]", "");
		str=str.trim();
		//System.out.println(str);
		//char arr[]=new char[str.length()];
		//arr=str.toCharArray();
		int count=0;
		int i=0;
		int len=str.length();
		while(i<len){
			char c=str.charAt(i);
			str=str.replace(c,' ');
			str=str.trim();
			len=str.length();
			i=0;
			count+=1;
			
		}
		System.out.println(count);
		
	}
}
