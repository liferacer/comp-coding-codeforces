import java.util.*;

public class doubleCola
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 5)
		{
			n -= 5;
			n = (n+1)/2;
		}
		String[] a = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
		System.out.println(a[n-1]);
	}
}


//12345     
//1122334455    
//11112222333344445555
//1111111122222222333333334444444455555555

//31,16  11,6 1,1
//32,16  11,6  1,1
//33,17  12,6  1,1
//34,17
//35,18  13,7  2,1
//36,18
//37,19  14,7
//38,19

//40,20 15,8 3,2