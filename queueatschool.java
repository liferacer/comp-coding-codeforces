import java.util.*;

public class queueatschool {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int totalstud=sc.nextInt();
		int time=sc.nextInt();
		String str=sc.next();
		char arr[]=new char[str.length()];
		arr=str.toCharArray();
		for(int i=0;i<time;i++){
			for(int j=1;j<totalstud;j++){
				if(arr[j]=='G'&&arr[j-1]=='B'){
					char temp;
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					j++;
				}
			}
		}
		for(int i=0;i<str.length();i++){
			System.out.print(arr[i]);
		}
	}
}
