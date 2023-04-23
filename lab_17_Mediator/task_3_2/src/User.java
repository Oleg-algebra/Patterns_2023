public class User {

    final private String userId;
    private Mediator mediator;
    final private String userType;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getUserId() {
        return userId;
    }

    public User(String userId, String userType) {
        this.userId = userId;
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }


    public void sendMessageAll(String message) {
        mediator.broadcast(message,"all",this);
    }


    public void sendMessage(String message, String userTo) {
        mediator.broadcast(message,userTo,this);
    }


    public void receiveMassage(String message, User userFrom) {
        System.out.printf("%s receives message: %s -- from %s\n",userId,message,
                userFrom.getUserId());
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
