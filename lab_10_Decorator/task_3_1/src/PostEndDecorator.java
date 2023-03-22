public class PostEndDecorator extends BaseDecorator {
    public PostEndDecorator(Printable printableString) {
        super(printableString);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n");
    }
}
