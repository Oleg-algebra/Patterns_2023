public class ConcreteUser implements User {

    final private String userId;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getUserId() {
        return userId;
    }

    public ConcreteUser(String userId) {
        this.userId = userId;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.broadcast(message,"all",userId);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.broadcast(message,userTo,userId);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}
