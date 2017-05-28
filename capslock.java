import java.util.*;

public class capslock {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=new char[str.length()];
		arr=str.toCharArray();
		int flag=0;
		if(str.length()>=2){
			for(int i=1;i<str.length();i++){
				if(Character.isUpperCase(arr[0])&&Character.isUpperCase(arr[i])){
					flag=1;
				}
				else if(Character.isLowerCase(arr[0])&&Character.isUpperCase(arr[i])){
					flag=2;
				}
				else{
					flag=0;
					break;
				}
			}
			
			
			if(flag==1){
				str=str.toLowerCase();
				arr=str.toCharArray();
				for(int i=0;i<str.length();i++){
					System.out.print(arr[i]);
				}
			}
			else if(flag==2){
				str=str.toLowerCase();
				arr=str.toCharArray();
				arr[0]=Character.toUpperCase(arr[0]);
				for(int i=0;i<str.length();i++){
					System.out.print(arr[i]);
				}
			}
			else{
				System.out.println(str);
			}
			
		}
		else{
			char c=str.charAt(0);
			if(Character.isUpperCase(c)){
				c=Character.toLowerCase(c);
				System.out.println(c);
			}
			else{
				c=Character.toUpperCase(c);
				System.out.println(c);
			}
			
		}
		
	
	}
}
