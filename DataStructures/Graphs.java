package DataStructures;
import java.util.*;

public class Graphs {
    public static void bfs(Map<Character, List<Character>> graph, Character start)
    {
        Queue<Character> queue = new LinkedList<>();

        List <Character> visited = new ArrayList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            Character v = queue.poll();
            System.out.println(v); // Process the Node


            for(Character u : graph.getOrDefault(v, Collections.emptyList()))
            {
                if(!visited.contains(u))
                {
                    visited.add(u);
                    queue.add(u);
                }
            }
        }
    }
    public static void main(String[] args) {

        //Graphs represented as adjacency lists
        Map <Character, List<Character>> graph = new HashMap<>();

        graph.put('a', new ArrayList<>(Arrays.asList('b', 'd')));
        graph.put('b', new ArrayList<>(Arrays.asList('c', 'f')));
        graph.put('c', new ArrayList<>(Arrays.asList('a', 'd')));
        graph.put('d', new ArrayList<>(Arrays.asList('e')));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>(Arrays.asList('c')));
        bfs(graph, 'a');
    }
}
