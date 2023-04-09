public class PrintCommand implements Command {
    final private Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        if(document != null) {
            document.print();
        }
    }
}
