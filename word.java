import java.util.*;

public class word {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int ch[]=new int[str.length()];
		int countU=0;
		int countL=0;
		for(int i=0;i<str.length();i++){
			ch[i]=str.charAt(i);
			if(ch[i]<=90){
				countU+=1;
			}else
			{
				countL+=1;
			}
		}
		
		if(countU>countL){
			str=str.toUpperCase();
		}
		else
		{
			str=str.toLowerCase();
		}
		System.out.println(str);
	}
}
