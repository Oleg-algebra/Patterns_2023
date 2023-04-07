public interface Handler {
    void setNext(Handler handler);
    void open(String file);
}
