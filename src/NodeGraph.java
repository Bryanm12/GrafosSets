import java.util.ArrayList;
import java.util.List;
public class NodeGraph<T> {
    private T user;
    public List<T> friends;

    public NodeGraph(T user){
    this.user=user;
    this.friends=new ArrayList<>();
    }
    public void addFriend(T friend){
        friends.add(friend);
    }
    public List<T> getFriends(){
        return friends;
    }
    public T getUser() {
        return user;
    }
    public void setUser(T user) {
        this.user = user;
    }
    public void setFriends(List<T> friends) {
        this.friends = friends;
    }
    
}
