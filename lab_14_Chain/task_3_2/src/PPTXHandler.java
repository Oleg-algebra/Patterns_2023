public class PPTXHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".pptx")){
            System.out.println("Opening PPTX file: " + file);
        }else {
            super.open(file);
        }
    }
}
