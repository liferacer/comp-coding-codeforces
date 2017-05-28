import java.util.*;

public class stones {
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int input=sc.nextInt();
		String str=sc.next();
		char chr[]=new char[input];
		for(int i=0;i<str.length();i++){
			chr[i]=str.charAt(i);
		}
		int count=0;
		for(int i=0;i<input-1;i++){
			if(chr[i]==chr[i+1]){
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
