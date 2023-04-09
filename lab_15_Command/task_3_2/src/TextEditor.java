import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TextEditor {

    private Document document ;
    private Button saveButton;
    private Button printButton;

    private MenuItem saveMenuItem;
    private MenuItem printMenuItem;
    private MenuItem showInfoMenuItem;

    private Shortcut saveShortcut;
    private Shortcut printShortcut;

    public TextEditor() {
        setEditorConfiguration();
    }

    private void setEditorConfiguration(){

        Command saveCommand = new SaveCommand(document);
        Command printCommand = new PrintCommand(document);
        Command showInfoCommand = new ShowInfoCommand(document);

        saveButton = new Button(saveCommand);
        printButton = new Button(printCommand);

        saveMenuItem = new MenuItem(saveCommand);
        printMenuItem = new MenuItem(printCommand);
        showInfoMenuItem = new MenuItem(showInfoCommand);

        saveShortcut = new Shortcut(saveCommand);
        printShortcut = new Shortcut(printCommand);
    }

    public void newDocument(String name) {
        document = new Document(name);
        setEditorConfiguration();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }
}
