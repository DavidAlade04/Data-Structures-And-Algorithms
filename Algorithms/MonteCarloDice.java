package Algorithms;
import java.util.Random;
public class MonteCarloDice {
    //Finding the probability of getting a sum of 25 by throwing 10 dice all at once

    public static void main(String []args)
    {
       Random rand = new Random();
        int trials = 1_000_000;
        int count = 0;
        int target = 25;
        for(int i = 0; i < trials; i++)
        {
            int sum = 0;
            for(int j = 0; j < 10; j++)
            {
                sum += rand.nextInt(6) + 1;

            }
            if(sum == target)
            {
                count++;
            }
        }

        double probability = (double) count / trials;
        System.out.println(probability);
    }
}
