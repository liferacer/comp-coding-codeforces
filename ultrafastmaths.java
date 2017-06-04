import java.util.*;

public class ultrafastmaths {
	public static void main(String args[]){ 
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		char arr1[]=new char[str1.length()];
		char arr2[]=new char[str2.length()];
		char arr3[]=new char[str2.length()];
		
		arr1=str1.toCharArray();
		arr2=str2.toCharArray();
		
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				arr3[i]='1';
				System.out.print(arr3[i]);
			}
			else
			{
				arr3[i]='0';
				System.out.print(arr3[i]);
			}
		}
	}
}
