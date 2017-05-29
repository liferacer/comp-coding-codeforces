import java.util.*;

public class hello {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr1[]=new char[str.length()];
		arr1=str.toCharArray();
	    
		char arr2[]=new char[5];
		String hello="hello";
		arr2=hello.toCharArray();
		
        int j=0;
        int intarr[]=new int[5];
    	for(int i=0;i<str.length();i++){
    		if(arr1[i]==arr2[j]){
    			intarr[j]=i;
    			j++;
    			if(j==5){
    				break;
    			}
    		}
    	}
    	if(j==5){
    		System.out.println("YES");
    	}
    	else{
    		System.out.println("NO");
    	}
	}
}



//ahhellllloou
