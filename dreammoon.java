import java.util.*;

public class dreammoon {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int min=0;

		if(n<m){
			System.out.println("-1");
		}
		else
		{
			if(n%2!=0){
				min=(n/2)+1;
			}
			else{
				min=(n/2);
			}
			for(int i=0;i<10000;i++){
			
				if(min%m!=0){
					min+=1;
				}
				else
				{
					break;
				}
			}

			System.out.println(min);
		}
		
		
	}
}
