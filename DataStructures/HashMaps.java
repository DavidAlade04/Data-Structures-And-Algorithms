package DataStructures;
import java.util.HashMap;
public class HashMaps {
    public static void main(String [] args)
    {
        HashMap <Integer, String> id = new HashMap<Integer, String>();

        id.put(2239028, "StudentOne");
        id.put(33423423, "StudentTwo");
        id.put(4637643, "StudentThree");

        System.out.println(id);
    }
}
