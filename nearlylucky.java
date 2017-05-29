import java.math.BigInteger;
import java.util.*;

public class nearlylucky {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger input = sc.nextBigInteger();
		String str=input.toString();
		int count1=0;
		int count2=0;
		char arr[]=new char[str.length()];
		arr=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(arr[i]=='4'){
				count1+=1;
			}
			else {
				if(arr[i]=='7'){
					count2+=1;
				}
			}
		}
		
		if((count1+count2)==4||(count1+count2)==7){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
