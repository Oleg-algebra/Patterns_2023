public class XLSXHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".xlsx")){
            System.out.println("Opening XLSX file: " + file);
        }else {
            super.open(file);
        }
    }
}
