public class HandlersManager {
    public Handler getHandler(){
        Handler guestHandler = new GuestHandler();
        Handler adminHandler = new AdminHandler();
        Handler userHandler = new UserHandler();

        guestHandler.setNext(adminHandler);
        adminHandler.setNext(userHandler);

        return guestHandler;
    }
}
