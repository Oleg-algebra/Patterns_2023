public class PostSpaceDecorator extends BaseDecorator {
    public PostSpaceDecorator(Printable printableString) {
        super(printableString);
    }

    @Override
    public void print() {   //post empty space at the end of the string
        super.print();
        System.out.print(" ");
    }
}
