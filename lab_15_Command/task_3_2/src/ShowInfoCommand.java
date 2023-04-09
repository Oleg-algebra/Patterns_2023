public class ShowInfoCommand implements Command {
    private final Document document;

    public ShowInfoCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        if(document != null) {
            document.showInfo();
        }
    }
}
