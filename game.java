import java.util.*;

public class game {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int k1=sc.nextInt();
		int k2=sc.nextInt();
		int x=n1;
		int y=n2;
		outer:while(x>0&&y>0){
			
			x-=1;
			if(x==0){
				System.out.println("Second");
				break;
			}
			
			y-=1;
			if(y==0){
				System.out.println("First");
				break;
			}
		}
	}
}
