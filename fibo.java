public class fibo {
	final static int MAX=100;
	final static int NIL=-1;
	
	static int lookup[]=new int[MAX];
	
	static void initialize(){
		for(int i=0;i<MAX;i++){
			lookup[i] = NIL;
		}
	}
	
	static int fib(int n){
		if(lookup[n]==NIL){
			if(n<=1){
				lookup[n]=n;
			}
			else
			{
				lookup[n]=fib(n-1)+fib(n-2);
			}
		}
		return lookup[n];
	}
	
	 public static void main(String[] args)
	  {
	    //Fibonacci f = new Fibonacci();
	    int n = 40;
	    initialize();
	    System.out.println("Fibonacci number is" + " " + fib(n));
	  }
}
