import java.util.*;

public class beautifullyear {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int flag=0;
		int ans=0;
		int newinput=0;
		outer:for(newinput=(input+1);newinput<90000;newinput++){
			String newstr=Integer.toString(newinput);
			char newarr[]=new char[newstr.length()];
			newarr=newstr.toCharArray();
			inner:for(int i=0;i<(newstr.length()-1);i++){
				  innermost:for(int j=i+1;j<newstr.length();j++){
					if(newarr[i]!=newarr[j]){
						flag=1;
					}
					else{
						flag=0;
						break inner;
					}
				}
			}
			if(flag==1){
				ans=newinput;
				System.out.println(ans);
				break outer;
			}
		}
	}
}















































/*Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		String str=Integer.toString(input);
		char arr[]=new char[input];
		arr=str.toCharArray();
		int flag=1;
		int newinput=input+1;
		int ans=0;
		int count=0;
						
		for(int k=newinput;k<9000;k++){
			String newstr=Integer.toString(newinput);
			char newarr[]=new char[newinput];
			newarr=newstr.toCharArray();
			for(int i=0;i<(newstr.length()-1);i++){
				for(int j=i+1;j<newstr.length();j++){
					if(newarr[i]==newarr[j]){
						flag=0;
						break;
					}
					else
					{
						flag=1;
						ans=k;
						
					}
				}
				
			}
		}
		System.out.println(ans);
		*/
