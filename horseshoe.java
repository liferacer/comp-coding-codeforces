import java.util.*;

public class horseshoe {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0;i<4;i++){
			arr[i]=sc.nextInt();
		}
		
		 for (int i = 0; i < 4; i++) 
	        {
	            for (int j = i + 1; j < 4; j++) 
	            {
	                if (arr[i] < arr[j]) 
	                {
	                	int temp;
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
		 
		 
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				count+=1;
			}
		}
		System.out.println(count);
	}
}

//147784432 947653080 947653080 947653080
//2

//1 7 4 4
//1

//7 7 7 7
//3

/*
Scanner s=new Scanner(System.in);
String str=s.nextLine();
str=str.replaceAll("[ ]", "");
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
System.out.println(4-count);
*/