import java.util.*;

public class hulk {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=null;
		for(int i=0;i<n;i++){
			if(i%2==0){
				if(i==0){
					str="I hate ";
				}
				else
				{
					str+="that I hate ";
				}
			
			}
			else
			{
				str+="that I love ";
			}
		}
		str+=("it");
		
		System.out.println(str);
	}
}
