public class Client {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();


        /////////////////////////////////////////////
        // Testing buttons, menu items, shortcuts...
        //////////////////////////////////////////////
        textEditor.clickSaveButton();
        textEditor.clickPrintButton();
        textEditor.newDocument("blank.txt");
        textEditor.clickSaveButton();
        textEditor.clickPrintButton();
        textEditor.selectShowInfoMenuItem();
        textEditor.newDocument("document_1.doc");
        textEditor.selectPrintMenuItem();
        textEditor.selectSaveMenuItem();
        textEditor.newDocument("document_2.pdf");
        textEditor.pressSaveShortcut();
        textEditor.pressPrintShortcut();
    }
}
