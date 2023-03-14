public class PostWordDecorator extends BaseDecorator {
    private final String word;
    public PostWordDecorator(Printable printableString, String word) {
        super(printableString);
        this.word = word;
    }

    @Override
    public void print() {   // post given word at the end of the string
        super.print();
        System.out.print(word);
    }
}
