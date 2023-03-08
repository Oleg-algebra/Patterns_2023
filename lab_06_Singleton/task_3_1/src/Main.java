public class Main {
    public static void main(String[] args) {
        TextEditorSingleton textEditorSingleton = TextEditorSingleton.getInstance();
        textEditorSingleton.showLinesNumber("task_3_1/Alice_in_the_wonderland.txt");
        textEditorSingleton.showWordsCount("task_3_1/Alice_in_the_wonderland.txt");

        TextEditorSingleton textEditorSingleton1 = TextEditorSingleton.getInstance();
        System.out.println("\n"+"textEditorSingleton == textEditorSingleton1: " + (textEditorSingleton == textEditorSingleton1));

        textEditorSingleton1.showWordsCount("task_3_1/Alice_in_the_wonderland.txt");
        textEditorSingleton1.addToFile("task_3_1/Alice_in_the_wonderland.txt", "\nAlice love patterns in programming!)))");
        textEditorSingleton.showFileContent("task_3_1/Alice_in_the_wonderland.txt");
    }
}
