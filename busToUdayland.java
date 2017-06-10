import java.util.*;

public class busToUdayland {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++){
			str[i]=sc.next();
		}
		int flag=0;
		for(int i=0;i<n;i++){
			int j=0;
			char c=str[i].charAt(j);
			char d=str[i].charAt(j+1);
			char e=str[i].charAt(j+3);
			char f=str[i].charAt(j+4);
			
			if(c==d&&c=='O'&&d=='O'){
				String s=str[i].substring(0, 2).replace("O", "+");	
				String concat=str[i].substring(3, 5);
				str[i]=s.concat("|").concat(concat);
				flag=1;
				break;
			}
			if(e==f&&e=='O'&&f=='O'){
				String s=str[i].substring(3, 5).replace("O", "+");	
				String concat=str[i].substring(0, 2);
				str[i]=concat.concat("|").concat(s);
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("YES");
			for(int i=0;i<n;i++){
				System.out.println(str[i]);
			}
		}
		
		else
		{
			System.out.println("NO");
		}
	
	}
}
