public class DOCHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".doc")){
            System.out.println("Opening DOC file: " + file);
        }else {
            super.open(file);
        }
    }
}
