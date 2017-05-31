import java.util.*;

public class translation {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String strrev=sc.next();
		char arrold[]=new char[str.length()];
		arrold=str.toCharArray();
		
		char arr[]=new char[strrev.length()];
		arr=strrev.toCharArray();
		int end=strrev.length()-1;
		int begin=0;
		for(begin=0;begin<end;begin++){
			char temp;
			temp=arr[begin];
			arr[begin]=arr[end];
			arr[end]=temp;
			end=end-1;
		}
		int flag=0;
		strrev=Arrays.toString(arr);
		
		for(int i=0;i<str.length();i++){
			if(arr[i]==arrold[i]){
				flag=1;
			}
			else{
				flag=0;
				break;
			}
		}
		if(flag==1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
