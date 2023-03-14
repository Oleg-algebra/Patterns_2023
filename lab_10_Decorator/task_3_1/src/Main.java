public class Main {

    public static void main(String[] args) {
        PrintableString hello1 = new PrintableString("Hello, World!");
        hello1.print();
        System.out.println();

        Printable hello = new PrintableString("");
        hello = new PreWordDecorator(hello,"Hello");
        hello = new PostComaDecorator(hello);
        hello = new PostSpaceEndDecorator(hello);
        hello = new PostWordDecorator(hello,"World");
        hello = new PostExclaimDecorator(hello);
        hello.print();
    }

}
