public class Main {

    public static void main(String[] args) {
        PrintableString hello_correct = new PrintableString("Hello, World!");
        System.out.println("------Correct output------");
        hello_correct.print();

        System.out.println("\n-------Decorator output------");
        Printable hello = new PrintableString("");
        hello = new PreWordDecorator(hello,"Hello");
        hello = new PostComaDecorator(hello);
        hello = new PostSpaceDecorator(hello);
        hello = new PostWordDecorator(hello,"World");
        hello = new PostExclaimDecorator(hello);
        hello = new PostEndDecorator(hello);
        hello.print();
    }

}
