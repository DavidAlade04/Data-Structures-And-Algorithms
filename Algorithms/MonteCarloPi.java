package Algorithms;

import java.util.Random;

public class MonteCarloPi {
    /*
    Approximating PI with random numbers
    Using the unit circle x^2 + y^2 = 1
    */

    public static void main(String []args)
    {
        Random rand = new Random();
        int numberOfPoints = 100_000;
        int inside = 0;
        for(int i = 0; i < numberOfPoints; i++)

        {
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            if(x*x + y*y <=1)
            {
                inside++;
            }

            
        }
        double p = (double) inside / numberOfPoints; //p=estimate of the area
        double pi = 4.0 * p;
        System.out.println(pi);
    }

    


}
