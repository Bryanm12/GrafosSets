
import java.util.Arrays;
import java.util.List;
public class App {
   
    public static void main(String[] args) throws Exception {
        Graph<User> graph = new Graph<>();
        User user = new User(null, 0, null);
        
        User usuario = new User("Alice", 30, Arrays.asList("Music","art"));
        User usuario1 = new User("Bob", 25, Arrays.asList("Music","Sport"));
        User usuario2 = new User("Charlie", 35, Arrays.asList("Art","Movies"));
        User usuario3 = new User("Dave", 40, Arrays.asList("Sports","Travel"));
        User usuario4 = new User("Eve", 28, Arrays.asList("Music","Movies"));

        NodeGraph<User> node1 = new NodeGraph<User>(usuario);
        NodeGraph<User> node2 = new NodeGraph<User>(usuario1);
        NodeGraph<User> node3 = new NodeGraph<User>(usuario2);
        NodeGraph<User> node4 = new NodeGraph<User>(usuario3);
        NodeGraph<User> node5 = new NodeGraph<User>(usuario4);

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        graph.addConnection(node1, node2);
        graph.addConnection(node1, node3);
        graph.addConnection(node2, node4);
        graph.addConnection(node2, node3);
        graph.addConnection(node3, node5);

        System.out.println(node1.getUser().getName());
        System.out.println(node2.getUser().getName());
        System.out.println(node3.getUser().getName());
        System.out.println(node4.getUser().getName());
        System.out.println(node5.getUser().getName());

        //List<User> amigos = new graph.getFriends(node1);
        //System.out.println("Amigos: ");
        //for(NodeGraph<User> friend : amigos){
        //    System.out.println("- "+friend.getUser());
        //}


        RecommendationEngine engine = new RecommendationEngine();
        List<User> recommendations = engine.recommendFriends(node1, graph);
        System.out.println("Friend recommendations for "+user.getName()+"+ "+recommendations);
    }
}
