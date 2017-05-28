import java.util.Scanner;

public class playdigits{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int input=sc.nextInt();
    int count=0;
    int flag=0;
    int test=1;
    
    for(int k=0;k<input;k++){
      String str=Integer.toString(test);
      int len=str.length();
      char arr[]=new char[len];
      arr=str.toCharArray();
      if(len==1){
        count=test;
      }
      else{
        for(int i=1;i<len;i++){
              if(arr[i-1]==arr[i]){
                flag=0;
                break;
              }
              else{
                flag=1;
              }
            
          
          
        }
        if(flag==1){
          count=count+1;
        }
      }
      test=test+1;
    }
    System.out.println(count);
    
  }
}