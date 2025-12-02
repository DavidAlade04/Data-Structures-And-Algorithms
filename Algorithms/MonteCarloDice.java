package Algorithms;
import java.util.Random;
public class MonteCarloDice {
    //Finding the probability of getting a sum of 25 by throwing 10 dice all at once

    public static void main(String []args)
    {
        Random rand = new Random();

        int trials = 100_000;
        int targetSum = 25;
        int count = 0;
        //Number of Trials
        for(int i = 0; i < trials; i++)
        {
            int sum = 0;
            //Random Dice throws
            for(int j = 0; j < 10; j++)
            {
                sum += rand.nextInt(6) + 1;
            }
            if(sum == targetSum)
            {
                count++;
            }
        }
        double probability = (double) count / trials;
        System.out.println(probability);
    }
}
