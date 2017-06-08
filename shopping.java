import java.util.*;

public class shopping {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int d1=sc.nextInt();
		int d2=sc.nextInt();
		int d3=sc.nextInt();
		int x=d1+d2+d3;
		int y=(2*d1)+(2*d2);
		int m=(2*d1)+(2*d3);
		int n=(2*d2)+(2*d3);
		int arr[]=new int[4];
		arr[0]=x;
		arr[1]=y;
		arr[2]=m;
		arr[3]=n;
		int min = arr[0];
        for(int i = 0; i < 4; i++)
        {
            if(min >arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println(min);
	}
}
