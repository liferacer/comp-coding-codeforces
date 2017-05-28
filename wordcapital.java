import java.util.*;

public class wordcapital {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=new char[str.length()];
		arr=str.toCharArray();
		arr[0]=Character.toUpperCase(arr[0]);
		for(int i=0;i<str.length();i++){
			System.out.print(arr[i]);
		}
	}
}
