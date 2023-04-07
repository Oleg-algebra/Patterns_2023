public class JPGHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".jpg")){
            System.out.println("Opening JPG image: " + file);
        }else {
            super.open(file);
        }
    }
}
