import java.util.*;

public class olesya {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String t=sc.next();
		if(t.equals("10")&&n==1){
			System.out.println("-1");
		}
		else
		{
			System.out.print(t);
			for(int i=0;i<n-t.length();i++){
				System.out.print("0");
			}
		}
		
	}
}

/*
String str=Long.toString(i);
if(str.length()==n){
	if(i%t==0){
		System.out.println(i);
		flag=1;
		break;
	}
}
*/