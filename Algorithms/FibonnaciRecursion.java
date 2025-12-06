package Algorithms;

public class FibonnaciRecursion {
    public static void main(String []args)
    {
        int N = 50;

        for(int i = 0; i< N; i++)
        {
            System.out.println(fibonacci(i));
        }
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
}
