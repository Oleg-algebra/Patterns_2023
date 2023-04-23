import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserCollection {
    protected final Map<String,User> users = new HashMap<>();
    public void addUser(User user){

        users.put(user.getUserId(), user);

    }
    public boolean contain(String user){
        return users.containsKey(user);
    }
    public User getUser(String user){
        return users.get(user);

    }
    public Collection<User> getAllUsers(){
        return users.values();
    }
}
