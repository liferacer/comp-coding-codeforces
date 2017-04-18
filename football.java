import java.util.*;
public class football {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		if((2<=n)&&(n<=100)){
				String ones="1111111";
				String zeroes="0000000";
				
				if((str.contains(ones))||(str.contains(zeroes))){
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			
		}
		
	}
}
