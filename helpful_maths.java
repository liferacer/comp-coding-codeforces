import java.util.*;

public class helpful_maths {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		str=str.replaceAll("[+]*","");
		int len=str.length();
		char arr[] = new char[len];
		arr=str.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<len-1;i++){
			System.out.print(arr[i]+"+");
		}
			System.out.println(arr[len-1]);	
	}
}
	