import java.util.*;

public class elephant {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int count=0;
		while(input>4){
			input=input-5;
			count=count+1;
		}
		if(input==4||input==3||input==2||input==1){
			count=count+1;
		}
		System.out.println(count);
	}
}

//in=12
//12-5=7 count=1
//7-5=2    count=2
//