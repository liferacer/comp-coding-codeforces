import java.math.BigInteger;
import java.util.*;

public class sasahsticks {
	public static void main(String argsd[]){
		Scanner sc=new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		BigInteger val=n.divide(m);
		if(val.mod(BigInteger.valueOf(2))==BigInteger.valueOf(0)){
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
			
	}
}
