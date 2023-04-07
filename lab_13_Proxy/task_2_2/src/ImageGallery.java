import java.util.Random;

public class ImageGallery {
    interface ImageFactory {
        DisplayObject createDisplayObject(String imagePath);
    }
    static class RealImageFactory implements ImageFactory {

        @Override
        public DisplayObject createDisplayObject(String imagePath) {
            return new ImageFile(imagePath);
        }
    }
    static class ProxyImageFactory implements ImageFactory {

        @Override
        public DisplayObject createDisplayObject(String imagePath) {
            return new ProxyImage(imagePath);
        }
    }

    public static void main(String[] args) {
//        ImageFactory factory = new RealImageFactory();
        ImageFactory factory = new ProxyImageFactory();
        DisplayObject[] images = {
            // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
            factory.createDisplayObject("task_2_2/resources/image1.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image2.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image3.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image4.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image5.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image6.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image7.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image8.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image9.jpeg"),
            factory.createDisplayObject("task_2_2/resources/image10.jpeg"),
        };
        Random random = new Random();
        int iter_number = 10;
        for (int i = 0; i<iter_number;i++) {
            int image_number = random.nextInt(images.length);
            DisplayObject image = images[image_number];
            image.display();
        }

    }

}
