public class PPTHandler extends BaseHandler {
    @Override
    public void open(String file) {
        if(file.endsWith(".ppt")){
            System.out.println("Opening PPT file: " + file);
        }else {
            super.open(file);
        }
    }
}
