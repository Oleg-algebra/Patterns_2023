import java.io.*;
import java.util.Scanner;
/*
Class provide instruments to work with text files.
 */
public class TextEditorSingleton {
    private final static TextEditorSingleton instance = new TextEditorSingleton();

    private TextEditorSingleton() {
    }

    public static TextEditorSingleton getInstance() {
        return instance;
    }

    private String text = "";

    public void showFileContent(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            text = text + line + "\n";
        }
        System.out.println("File content:\n" + text);
    }

    public void showLinesNumber(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int counter = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            counter += 1;
        }
        System.out.printf("File %s has %s lines\n", fileName, counter);
    }

    public void showWordsCount(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int counter = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //System.out.println(Arrays.toString(line.split("\\s+")));
            counter += line.split("\\s+").length;
        }
        System.out.printf("File %s has %s words\n", fileName, counter);
    }


    public void addToFile(String fileName, String content) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
