public class DOCXHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".docx")){
            System.out.println("Opening DOCX file: " + file);
        }else {
            super.open(file);
        }
    }
}
