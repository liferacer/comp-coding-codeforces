import java.util.*;

public class liyaAndBankAccount {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		if(in>=0){
			System.out.println(in);
		}
		else
		{
			String str=Integer.toString(in);
			
			String tempstr1=str;
			int len1=str.length();
			tempstr1=tempstr1.substring(0, len1-1);
			//System.out.println(tempstr1);
			
			String tempstr2=str;
			int len2=str.length();
			tempstr2=tempstr2.substring(0, len2-2)+tempstr2.substring(len2-1, len2);
			//System.out.println(tempstr2);
			
			int val1=Integer.parseInt(tempstr1);
			int val2=Integer.parseInt(tempstr2);
			
			if(val1>val2){
				System.out.println(val1);
			}
			else
			{
				System.out.println(val2);
			}
			
		}
	}
}
