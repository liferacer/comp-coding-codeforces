import java.util.*;

public class zeroesAndOnes {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int c0=0;
		int c1=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c=='0'){
				c0+=1;
			}
			else if(c=='1')
			{
				c1+=1;
			}
		}
		if(c0<c1){
			System.out.println(c1-c0);
		}
		else if(c0==c1){
			System.out.println("0");
		}
			
		else
		{
			System.out.println(c0-c1);
		}
		
	}
}


//1010


/*char arr[]=new char[str.length()];
arr=str.toCharArray();

if(arr[i]!=arr[i+1]){
	arr[i]=' ';
	arr[i+1]=' '; 
}
str=Arrays.toString(arr);
*/