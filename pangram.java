import java.util.*;

public class pangram {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		String str=sc.next();
		str=str.toLowerCase();
		int count=0;
		int i=0;
		int len=str.length();
		while(i<len){
			char c=str.charAt(i);
			str=str.replace(c,' ');
			str=str.trim();
			count+=1;
			len=str.length();
			i=0;
		}
		if(count==26){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}


//12
//


/*char arr[]=new char[str.length()];
arr=str.toCharArray();
int a=(int)'a';
int z=(int)'z';

int count=0;
for(int i=0;i<arr.length;i++){
	for(int j=a;j<=z;j++){
		if(arr[i]==j){
			count+=1;
		}
	}
}

if(count==26){
	System.out.println("YES");
}
else
{
	System.out.println("NO");
}
*/