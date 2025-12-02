package DataStructures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[]args)
    {
        LinkedList <String> names = new LinkedList<String>();


        names.add("David");
        names.add("Goliath");
        names.add("Samson");
        names.add ("Samuel");
        System.out.println("Before any changes " + names);


        names.addFirst("First");

        System.out.println("Adding to the front of the list " + names);

        names.addLast("Last");

        System.out.println("Adding to the end of the list " + names);


        



    }
}
