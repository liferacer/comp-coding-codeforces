import java.util.*;

public class boyorgirl {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
			int count=0;
		  	String newstr=str;
		  	for(int i=0;i<str.length();i++){

				if(newstr.isEmpty()){
					break;
				}
		    	char arr[]=new char[newstr.length()];
				arr=newstr.toCharArray();
				count=count+1;
				newstr=newstr.replaceAll(Character.toString(arr[0]),"");
				
			}
		if(count%2==1){
			System.out.println("IGNORE HIM!");
		}
		else{
			System.out.println("CHAT WITH HER!");
		}
		
	}
}
//wjmzbmr