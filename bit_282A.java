import java.util.*;

public class bit_282A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		
		if((1<=n)&&(n<=150)){
			int count=0;
			for(int i=0;i<n;i++){
				arr[i] = sc.next();
				if((arr[i].equals("X++"))||(arr[i].equals("++X"))){
					count+=1;
				}
				else if((arr[i].equals("X--"))||(arr[i].equals("--X"))){
					count-=1;
				}
			}
			System.out.println(count);
		}
	}
}
