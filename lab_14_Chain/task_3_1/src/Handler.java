public interface Handler {
    void setNext(Handler handler);
    void handle(Account account);
}
