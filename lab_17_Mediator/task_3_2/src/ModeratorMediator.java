import java.util.Collection;

public class ModeratorMediator extends ConcreteUserMediator {


    @Override
    public void broadcast(String message, String userTo, User userFrom) {
        if(super.isCollectionChosen()) {
            if (userTo.equalsIgnoreCase("moderator")) {
                Collection<User> users = userCollection.getAllUsers();
                for (User user : users) {
                    if (user.getUserType().equalsIgnoreCase("moderator")) {
                        user.receiveMassage(message, userFrom);
                    }
                }
            } else {
                super.broadcast(message, userTo, userFrom);
            }
        }else{
            System.out.println("ModeratorMediator: No users found!");
        }
    }
}
