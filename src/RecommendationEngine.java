import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecommendationEngine {
    public List<User> recommendFriends(NodeGraph<User> node, Graph<User> graph){
        List<User> recommendations = new ArrayList<>();
        for(NodeGraph<User> potenetialFriendNode : graph.getFriends(node)){
            User potentialFriend = potenetialFriendNode.getUser();
            if(!node.getFriends().contains(potentialFriend) && !node.getUser().equals(potentialFriend));
            double similarity = calculateSimilarity(node.getUser(), potentialFriend);
            if(similarity>0.3){
                recommendations.add(potentialFriend);

            }
        }
        return recommendations;
    }
    public double calculateSimilarity(User user1, User user2){
        Set<String> interests1 = new HashSet<>(user1.getInterests());
        Set<String> interests2 = new HashSet<>(user2.getInterests());
        Set<String> intersection = new HashSet<>(interests1);
        intersection.retainAll(interests2);
        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double resp = (double) intersection.size()/union.size();
        System.out.println("Valor - "+resp);
        return resp;
    }
}
