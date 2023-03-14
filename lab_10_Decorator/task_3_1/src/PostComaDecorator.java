public class PostComaDecorator extends BaseDecorator {

    public PostComaDecorator(Printable printableString) {
        super(printableString);
    }

    @Override
    public void print() {   // post coma at the end of the string
        super.print();
        System.out.print(",");
    }
}
