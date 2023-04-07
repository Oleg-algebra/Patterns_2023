public class AccountHandler implements Handler {
    private Handler next = null;

    @Override
    final public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Account account) {
        if (next!=null){
            next.handle(account);
        }else {
            System.out.println("Unknown account type");
        }

    }
}
