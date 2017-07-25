import java.util.*;

public class GraphQues {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int flag[][]=new int[m][m];
		for(int i=0;i<m;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			flag[x][y]=1;	
			flag[y][x]=1;
		}
		int array[]=new int[m];
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(flag[a][b]==1){
				array[i]=1;
			}
			else
			{
				array[i]=2;
			}
		}
		for(int i=0;i<q;i++){
			if(array[i]==1){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
				
		}
		
		
		
	}

}
