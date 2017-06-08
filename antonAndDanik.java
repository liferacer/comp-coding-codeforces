import java.util.*;

public class antonAndDanik {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int c1=0;
		int c2=0;
		for(int i=0;i<n;i++){
			char c=str.charAt(i);
			if(c=='D'){
				c1+=1;
			}
			else
			{
				c2+=1;
			}
		}
		if(c1>c2){
			System.out.println("Danik");
		}
		else if(c1<c2){
			System.out.println("Anton");
		}
		else
		{
			System.out.println("Friendship");;
		}
	}
}
