
public interface Mediator {
    void setUserCollection(UserCollection userCollection);
    void setNext(Mediator mediator);
    void broadcast(String message,String userTo, User userFrom);
}
