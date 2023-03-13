public abstract class Button {
    protected Size size;

    public Button(Size size) {
        this.size = size;
    }

    void draw(){
        System.out.printf("Setting size to %s\n",size.getSize());
    }

}
