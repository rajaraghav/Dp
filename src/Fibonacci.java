public class Fibonacci {

    public static int fibonacciTopDown(int n)
    {
        int arr[] = new int[n+1];
        return fibonacciTopDownHelper(n,new int[n+1]);
    }
    private static int fibonacciTopDownHelper(int n,int cache[]){

        if(cache[n]==0)
        {cache[n]=fibonacciTopDownHelper(n-1,cache)+fibonacciTopDownHelper(n-2,cache);}
        return cache[n];
    }
    static int fibonacciBottomUp(int n){
    return fibonacciBottomUpHelper(n);
    }
    private static int fibonacciBottomUpHelper(int n){
        int a=0;
        int b=1;

        for(int i=2;i<=n;i++)
        {
            int c=b;
            b=b+a;
            a=c;
        }
        return b;
    }
}
