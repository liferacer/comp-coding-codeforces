import java.util.*;

public class luckydiv {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int arr[]={4,7,47,74,444,447,474,744,477,747,774,777};
		int flag=0;
		for(int i=0;i<arr.length;i++){
			if(input%arr[i]==0){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
