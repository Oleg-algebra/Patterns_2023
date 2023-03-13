public class ImageButton extends Button {
    public ImageButton(Size size) {
        super(size);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing image button.\n");
    }
}
