import java.util.*;

public class soldierandbanana {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int firstcost=sc.nextInt();
		int dollarhas=sc.nextInt();
		int numtobuy=sc.nextInt();
		int sum=0;
		for(int i=1;i<=numtobuy;i++){
			sum+=i*firstcost;
		}
		int toborrow=sum-dollarhas;
		
		if(toborrow<0){
			System.out.println("0");
		}else{
			System.out.println(toborrow);
		}
	}
}
