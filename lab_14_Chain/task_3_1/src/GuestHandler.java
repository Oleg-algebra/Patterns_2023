public class GuestHandler extends AccountHandler {
    @Override
    public void handle(Account account) {
        Account.AccessType accessType = account.getAccessType();
        if (accessType == Account.AccessType.Guest) {
            System.out.println("Guest access provided!");
        }else{
            super.handle(account);
        }
    }
}
