import java.util.*;
public class stack{
    int front=0;
    int arr[]=new int[5];
    public static void main(String args[]){
        stack ob=new stack();
        ob.pushword(2);
        ob.pushword(3);
        ob.pushword(4);
        ob.pushword(5);
        ob.pushword(6);
        
        ob.popword();
        ob.popword();
        ob.popword();

        ob.show();
        
    }
    
    private void pushword(int a){
        if(front==5){
            System.out.println("overflow");
        }
        else
        {
            arr[front]=a;
            front++;

        }
    }
    
    private void popword(){
        if(front==0){
            System.out.println("stack is empty");
        }
        else
        {
            front--;
        }
    }
    
    private void show(){
    	for(int i=0;i<front;i++){
    		System.out.print(arr[i]+" ");
    	}
    }
    
    
    
    
    
    
    
}