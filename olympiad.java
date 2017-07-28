import java.util.*;

public class olympiad {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		int count1=0;
		int count2=0;
		int count3=0;
		
		int a1[]=new int[n];
		int a2[]=new int[n];
		int a3[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
			if(arr[i]==1){
				a1[count1]=i+1;
				count1+=1;
			}
			if(arr[i]==2){
				a2[count2]=i+1;
				count2+=1;
			}
			if(arr[i]==3){
				a3[count3]=i+1;
				count3+=1;
			}
		}
		
		int min=Math.min((Math.min(count1, count2)), count3);
		
		if(min!=0){
			System.out.println(min);
			for(int i=0;i<min;i++){
				System.out.print(a1[i]+" ");
				System.out.print(a2[i]+" ");
				System.out.print(a3[i]+" ");
				System.out.println();
			}
		}
		else
		{
			System.out.println(min);
		}
		
		
		
	}
}
