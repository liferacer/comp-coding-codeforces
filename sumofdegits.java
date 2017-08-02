import java.util.*;

public class sumofdegits {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt(); 
		int sum = scan.nextInt(); 
		int sum1 = sum-1;
		if(sum==0&&length!=1||sum>9*length)
		{
			System.out.print("-1 -1");
			return;
		}
		String ans1 = "" , ans2 = "";
		for(int i = 0;i<length;i++){
			ans1+=Math.min(9, sum); 
			sum-=Math.min(9, sum);
		}
		for(int i = 0;i<length-1;i++){
			ans2 = Math.min(9, sum1)+ans2;
			sum1-=Math.min(9, sum1);
		}
		ans2=(sum1+1)+ans2;
		System.out.print(ans2+" "+ans1);
	}
}