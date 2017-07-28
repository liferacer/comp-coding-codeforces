import java.util.*;

public class keyboard {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str1="qwertyuiop";
		String str2="asdfghjkl;";
		String str3="zxcvbnm,./";
		
		char arr[][]=new char[3][100];
		arr[0]=str1.toCharArray();
		arr[1]=str2.toCharArray();
		arr[2]=str3.toCharArray();
		
		String LR=sc.next();
		String input=sc.next();
		char output[]=new char[input.length()];
		if(LR.equals("R")){
			for(int i=0;i<input.length();i++){
				int position=0;
				char c=input.charAt(i);
				for(int j=0;j<str1.length();j++){
					if(str1.charAt(j)==c){
						position=j;
						output[i]=arr[0][position-1];
					}
				}
				for(int j=0;j<str2.length();j++){
					if(str2.charAt(j)==c){
						position=j;
						output[i]=arr[1][position-1];
					}
				}
				for(int j=0;j<str3.length();j++){
					if(str3.charAt(j)==c){
						position=j;
						output[i]=arr[2][position-1];
					}
				}
				
			}
		}
		else
		{
			for(int i=0;i<input.length();i++){
				int position=0;
				char c=input.charAt(i);
				for(int j=0;j<str1.length();j++){
					if(str1.charAt(j)==c){
						position=j;
						output[i]=arr[0][position+1];
					}
				}
				for(int j=0;j<str2.length();j++){
					if(str2.charAt(j)==c){
						position=j;
						output[i]=arr[1][position+1];
					}
				}
				for(int j=0;j<str3.length();j++){
					if(str3.charAt(j)==c){
						position=j;
						output[i]=arr[2][position+1];
					}
				}
				
			}
		}
		System.out.println(output);
	}
}
