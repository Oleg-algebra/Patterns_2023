public class BaseHandler implements Handler {
    private Handler next;
    @Override
    final public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void open(String file) {
        if(next!=null){
            next.open(file);
        }else{
            System.out.println("Unknown file type: " + file );
        }
    }
}
