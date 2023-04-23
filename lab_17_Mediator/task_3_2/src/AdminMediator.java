import java.util.Collection;

public class AdminMediator extends ConcreteUserMediator {


    @Override
    public void broadcast(String message, String userTo, User userFrom) {
        if(super.isCollectionChosen()) {
            if (userTo.equalsIgnoreCase("admin")) {
                Collection<User> users = userCollection.getAllUsers();
                for (User user : users) {
                    if (user.getUserType().equalsIgnoreCase("admin")) {
                        user.receiveMassage(message, userFrom);
                    }
                }
            } else {
                super.broadcast(message, userTo, userFrom);
            }
        }else{
            System.out.println("AdminMediator: No users found!");
        }
    }
}
