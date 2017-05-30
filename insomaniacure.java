import java.util.*;

public class insomaniacure {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[4];
		for(int i=0;i<4;i++){
			arr1[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		int arr[]=new int[d];
		for(int i=0;i<d;i++){
			arr[i]=0;
		}
		//double min=d/arr1[0];
		//double val=Math.floor(min);
		for(int i=0;i<d;i++){
			for(int j=0;j<4;j++){
				if((arr1[j]*(i+1))<=d){
					arr[((i+1)*arr1[j])-1]=arr1[j]*(i+1);
				}
			}
		}
		int count=0;
		for(int i=0;i<d;i++){
			if(arr[i]!=0){
				count+=1;
			}
		}
		System.out.println(count);
		
	}
}
