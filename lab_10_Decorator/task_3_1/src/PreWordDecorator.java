public class PreWordDecorator extends BaseDecorator {
    private String word;

    public PreWordDecorator(Printable printableString, String word) {
        super(printableString);
        this.word = word;
    }

    @Override
    public void print() {   // post given word at the beginning of the string
        System.out.print(word);
        super.print();
    }
}
