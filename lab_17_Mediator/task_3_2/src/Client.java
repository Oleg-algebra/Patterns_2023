import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        String[] usersTypes = {
                "Admin",
                "Moderator",
                "User"
        };
        Mediator mediator1 = new ConcreteUserMediator();
        Mediator mediator2 = new AdminMediator();
        Mediator mediator3 = new ModeratorMediator();
        Mediator mediator4 = new AllUsersMediator();
        mediator1.setNext(mediator2);
        mediator2.setNext(mediator3);
        mediator3.setNext(mediator4);

        UserCollection userCollection = new UserCollection();
        Random random = new Random();
        int users_number = random.nextInt(10,20);
        int userId = 100;
        for(int i = 0; i<users_number; i++){
            String type = usersTypes[random.nextInt(usersTypes.length)];
            User user = new User(type+"_"+userId,type);
            user.setMediator(mediator1);
            userCollection.addUser(user);
            userId++;
        }
        mediator1.setUserCollection(userCollection);
        mediator2.setUserCollection(userCollection);
        mediator3.setUserCollection(userCollection);
        mediator4.setUserCollection(userCollection);

        List<User> users = new ArrayList<>(userCollection.getAllUsers());
        User user1 = users.get(0);
        User user2 = users.get(1);
        User user3 = users.get(2);
        User user4 = users.get(3);

        System.out.println("==========Message for everyone=======");
        user1.sendMessageAll("Hello everybody");
        System.out.println("==========Message for admins=======");
        user2.sendMessage("Hello admins))","Admin");
        System.out.println("==========Message for moderators=======");
        user3.sendMessage("Hello moderators", "moderator");
        System.out.println("==========Message for concrete user=======");
        user4.sendMessage("Hello, "+user1.getUserId(),user1.getUserId());
        System.out.println("==========Message for incorrect recipient=======");
        user4.sendMessage("Hello, Mr.Unknown","Unknown");






    }

}
