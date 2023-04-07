import java.util.HashMap;
import java.util.Map;

public class AdminHandler extends AccountHandler {
    // Login and passwords for administrators
    private final Map<String, String> adminsAccounts = new HashMap<>();

    public AdminHandler() {
        adminsAccounts.put("admin", "123qweASD");
        adminsAccounts.put("administrator", "1234");
    }
    @Override
    public void handle(Account account) {
        Account.AccessType accessType = account.getAccessType();
        String userLogin = account.getLogin();
        String userPassword = account.getPassword();

        if (accessType == Account.AccessType.Administrator) {
            String passwordFromAdminsStorage = adminsAccounts.get(userLogin);
            if (userPassword.equals(passwordFromAdminsStorage) && userPassword.length() >= 8) {
                System.out.println("Administrator access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }
        } else {
            super.handle(account);
        }
    }
}
