public class PDFHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".pdf")){
            System.out.println("Opening PDF file: " + file);
        }else {
            super.open(file);
        }
    }
}
