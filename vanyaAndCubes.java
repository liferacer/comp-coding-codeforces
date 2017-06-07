import java.util.*;

public class vanyaAndCubes {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int j=1;
		int count=0;
		while(in>0){
			int fn=0;
			for(int i=1;i<=j;i++){
				fn+=i;
			}
			in=in-fn;
			count+=1;
			int fnnew=0;
			for(int i=1;i<=j+1;i++){
				fnnew+=i;
			}
			if(in<fnnew){
				break;
			}
			
			j+=1;
		}
		

		System.out.println(count);
	}
}























/**/