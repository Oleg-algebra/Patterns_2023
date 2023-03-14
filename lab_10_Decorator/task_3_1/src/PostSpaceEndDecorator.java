public class PostSpaceEndDecorator extends BaseDecorator {
    public PostSpaceEndDecorator(Printable printableString) {
        super(printableString);
    }

    @Override
    public void print() {   //post empty space at the end of the string
        super.print();
        System.out.print(" ");
    }
}
