public class PostExclaimDecorator extends BaseDecorator {


    public PostExclaimDecorator(Printable printableString) {
        super(printableString);
    }

    @Override
    public void print() {   // post exclaim at the end of the string
        super.print();
        System.out.print("!");
    }
}
