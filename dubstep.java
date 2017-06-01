import java.util.*;

public class dubstep {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			str=str.replace("WUB"," ");
			str=str.trim().replaceAll("\\s{2,}", " ");
		}
		System.out.println(str);
	}
}
//WUB WE WUB ARE WUB WUB THE WUB CHAMPIONS WUB MY WUB FRIEND WUB





