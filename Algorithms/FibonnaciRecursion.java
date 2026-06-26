package Algorithms;

public class FibonnaciRecursion {
    public static void main(String []args)
    {
        int N = 50;

        for(int i = 0; i< N; i++)
        {
            //System.out.println(fibonacci(i));
            
        }
        System.out.println(factorial(9));
        System.out.println(iterativeRecursion(9));
    }
    public static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return (n-1) + (n-2);
        }
    }

    public static int factorial (int n)
    {
        
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }

    public static int iterativeRecursion(int n)
    {
        int k = 1;

        while(n > 0)
        {
            k *= n;
            n--;
        }
        return k;
    }
}
