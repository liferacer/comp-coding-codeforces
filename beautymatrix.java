import java.util.*;

public class beautymatrix {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int px=0;
		int py=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(arr[i][j]==1){
					px=i;
					py=j;
				}
			}
		}
		int cx=Math.abs(px-2);
		int cy=Math.abs(py-2);
		System.out.println(cx+cy);
	}
}
