import java.util.HashMap;
import java.util.Map;

public class ChatMediator implements Mediator {
    private final Map<String,ConcreteUser> users = new HashMap<>();
    public void addUser(ConcreteUser user){

        users.put(user.getUserId(), user);

    }
    @Override
    public void broadcast(String message, String userTo,String userFrom) {
        if(userTo.equals("all")){
            for(ConcreteUser user : users.values()){
                if(!user.getUserId().equals(userFrom)) {
                    user.receiveMassage(message, userFrom);
                }
            }
        }else{
            if(users.containsKey(userTo)) {
                if(!users.get(userTo).getUserId().equals(userFrom)) {
                    users.get(userTo).receiveMassage(message, userFrom);
                }
            }
        }
    }
}
