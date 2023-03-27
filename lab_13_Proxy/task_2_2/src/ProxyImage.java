import java.awt.image.BufferedImage;

public class ProxyImage implements DisplayObject {
    private final String image_path;
    private DisplayObject image;

    public ProxyImage(String imagePath) {
        image_path = imagePath;
    }

    @Override
    public void display() {
        if(image == null){
            image = new ImageFile(image_path);
        }
        image.display();

    }
}
