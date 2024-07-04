import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
public class Graph<T> {
    private Map<NodeGraph<T>, List<NodeGraph<T>>> nodes;

    public Graph(){
        this.nodes= new HashMap<>();
    }
    public void addNode(NodeGraph<T> node){
        nodes.putIfAbsent(node,new ArrayList<>());
        
    }
    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2){
        nodes.get(node1).add(node2);
        nodes.get(node2).add(node1);
    }
    public List<NodeGraph<T>> getFriends(NodeGraph<T> node){
        return nodes.get(node);
    }
    public List<NodeGraph<T>> recommendFriends(NodeGraph<T> node){
        Set<NodeGraph<T>> friends = new HashSet<>(nodes.get(node));
        Set <NodeGraph<T>> recommendFriends = new HashSet<>();

        for(NodeGraph<T> friend : friends){
            for(NodeGraph<T> friendOfFriend: nodes.get(friend)){
                if(!friends.contains(friendOfFriend)&&!friendOfFriend.equals(node)){
                    recommendFriends.add(friendOfFriend);
                }
            }
        }

        return new ArrayList<>(recommendFriends);
    }
}
