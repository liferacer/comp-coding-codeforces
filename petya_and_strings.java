import java.util.*;

public class petya_and_strings {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String str1=sc.next();
		str1=str1.toLowerCase();
		String str2=sc.next();
		str2=str2.toLowerCase();
		int len1=str1.length();
		int len2=str2.length();
		if((1<=len1&&len1<=100)&&(1<=len2&&len2<=100)){
			if(str1.compareTo(str2)==0){
				System.out.println("0");
			}
			else if(str1.compareTo(str2)<0){
				System.out.println("-1");
			}
			else if(str1.compareTo(str2)>0){
				System.out.println("1");
			}
			
		
		}
		
	}
}
