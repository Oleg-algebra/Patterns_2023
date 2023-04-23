import java.util.Collection;

public class AllUsersMediator extends ConcreteUserMediator {


    @Override
    public void broadcast(String message, String userTo, User userFrom) {
        if(super.isCollectionChosen()) {
            if (userTo.equalsIgnoreCase("all")) {
                Collection<User> users = userCollection.getAllUsers();
                for (User user : users) {
                    user.receiveMassage(message, userFrom);
                }
            } else {
                super.broadcast(message, userTo, userFrom);
            }
        }else{
            System.out.println("AllUsersMediator: No users found!");
        }
    }
}
