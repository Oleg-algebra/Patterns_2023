import java.util.HashMap;
import java.util.Map;

public class UserHandler extends AccountHandler {
    // Login and passwords for users
    private final Map<String, String> usersAccounts = new HashMap<>();

    public UserHandler() {
        usersAccounts.put("andrii", "1234");
        usersAccounts.put("black_knight", "S@ruman1");
        usersAccounts.put("white_knight", "ruman1");
    }

    @Override
    public void handle(Account account) {
        Account.AccessType accessType = account.getAccessType();
        String userLogin = account.getLogin();
        String userPassword = account.getPassword();

        if (accessType == Account.AccessType.User) {

            String passwordFromUserStorage = usersAccounts.get(userLogin);
            if (userPassword.equals(passwordFromUserStorage)) {
                System.out.println("User access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }
        } else {
            super.handle(account);
        }
    }
}