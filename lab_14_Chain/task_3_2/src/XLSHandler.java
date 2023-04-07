public class XLSHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".xls")){
            System.out.println("Opening XLS file: " + file);
        }else {
            super.open(file);
        }
    }
}
