import java.util.*;

public class meetFriends {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double a[]=new double[3];
		for(int i=0;i<3;i++){
			a[i]=sc.nextDouble();
		}
		Arrays.sort(a);
		double m=a[1];
		double y1=Math.abs(m-a[0]);
		double y2=Math.abs(m-a[1]);
		double y3=Math.abs(m-a[2]);
		int y=(int) (y1+y2+y3);
		System.out.println(y);
	}
}


/*	double x1=sc.nextInt();
double x2=sc.nextInt();
double x3=sc.nextInt();

double x=(x1+x2+x3)/3.0;
System.out.println(x);
double y1=Math.abs(x-x1);
System.out.println(y1);
double y2=Math.abs(x-x2);
System.out.println(y2);
double y3=Math.abs(x-x3);
System.out.println(y3);
int y=(int) (y1+y2+y3);
System.out.println(y);*/