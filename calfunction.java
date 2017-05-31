import java.math.BigInteger;
import java.util.*;

public class calfunction {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		long bi=n.longValueExact();
		long output=0;
		if(bi%2==0){
			output=(bi/2);
		}
		else if(bi%2==1)
		{
			output=-((bi/2)+1);	
		}
		System.out.println(output);
	}
}
