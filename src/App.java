import java.lang.classfile.components.ClassPrinter.Node;
import java.util.List;
public class App {
   
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Graph<String> redSocial = new Graph<>();

        NodeGraph<String> user = new NodeGraph<>("Mateo");
        NodeGraph<String> user1 = new NodeGraph<>("Ana");
        NodeGraph<String> user2 = new NodeGraph<>("Alicia");
        NodeGraph<String> user3 = new NodeGraph<>("Pedro");

        redSocial.addNode(user);
        redSocial.addNode(user1);
        redSocial.addNode(user2);
        redSocial.addNode(user3);

        redSocial.addConnection(user, user1);
        redSocial.addConnection(user, user2);
        redSocial.addConnection(user1, user2);
        redSocial.addConnection(user1, user3);
        List<NodeGraph<String>> friendsOfUser = redSocial.getFriends(user);
        List<NodeGraph<String>> recommendFriendsUser = redSocial.recommendFriends(user);

        System.out.println("Amigos de Mateo: ");
        for(NodeGraph<String> friend : friendsOfUser){
            System.out.println("- "+friend.getUser());
        }

        System.out.println("Amigos recomendados para Mateo: ");
        for(NodeGraph<String> recommendFriend: recommendFriendsUser){
            System.out.println("- "+recommendFriend.getUser());
        }
    }
}
