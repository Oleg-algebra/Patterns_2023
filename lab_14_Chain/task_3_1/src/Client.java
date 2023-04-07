
public class Client {

    public static void main(String[] args) {

        Account[] users = {
            Account.createAdmin("admin", "123qweASD"),
            Account.createAdmin("administrator", "1234"),
            Account.createUser("andrii", "1234"),
            Account.createGuest(),
            Account.createUser("black_knight", "S@ruman1"),
            Account.createUser("white_knight", "S111"),
            Account.createGuest(),
        };
        HandlersManager handlersManager = new HandlersManager();
        Handler handler = handlersManager.getHandler();
        for (Account user : users) {
            handler.handle(user);
            }
        }
}

