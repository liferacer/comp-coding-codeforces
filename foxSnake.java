import java.util.*;

public class foxSnake {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x=1;
		int y=3;
		for(int i=0;i<n;i++){
			if(i%2==0){
				for(int j=0;j<m;j++){
					System.out.print("#");
				}
				System.out.println();
			}
			else if(i%2!=0&&i==x)
			{
				for(int j=0;j<m;j++){
					if(j<m-1){
						System.out.print(".");
					}
					else
					{
						System.out.print("#");
					}

				}
				x+=4;
				System.out.println();
			
			}
			else if(i%2!=0&&i==y){
				for(int j=0;j<m;j++){
					if(j==0){
						System.out.print("#");
					}
					else
					{
						System.out.print(".");
					}

				}
				y+=4;
				System.out.println();
			}
		}
	}
}

			
