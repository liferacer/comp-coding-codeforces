import java.util.*;

public class shovel {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int r=sc.nextInt();
		int count=0;
		for(int i=1;i<1000;i++){
			count+=1;
			if((k*i)%10==r){
				break;
			}
			if(k*i%10==0){
				break;
			}
			
		}
		System.out.println(count);
	}
}
