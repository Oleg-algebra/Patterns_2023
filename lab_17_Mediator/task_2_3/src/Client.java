public class Client {

    public static void main(String[] args) {
        ConcreteUser[] users = {
                new ConcreteUser("User1"),
                new ConcreteUser("User2"),
                new ConcreteUser("User3"),
                new ConcreteUser("User4")
        };
        ChatMediator mediator = new ChatMediator();
        for (ConcreteUser user : users) {
            user.setMediator(mediator);
            mediator.addUser(user);
        }

        users[0].sendMessageAll("Hello, world!");

        users[1].sendMessage("Hello!", "User1");
        users[3].sendMessageAll("Hello everybody");
        users[2].sendMessage("Let's be friends", "User4" );

    }

}
