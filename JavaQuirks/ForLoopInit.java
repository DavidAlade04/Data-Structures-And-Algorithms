package JavaQuirks;

public class ForLoopInit {
    public static void main(String[] args) {
        int i = 7;
        //For Loop with no Condition runs infinitely
        //i does not have to be re initialized
        //With no decrement or increment it is also Infinite
 
        for(;i< 10;i++)
        {
            System.out.println (i);
        }
        //No
    }
}
