public class PNGHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".png")){
            System.out.println("Opening PNG file: " + file);
        }else {
            super.open(file);
        }
    }
}
