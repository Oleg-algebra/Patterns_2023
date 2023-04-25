public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("task_3_1/resources/input01.txt");

        LongestLine longestLine = new LongestLine();
        LongestWord longestWord = new LongestWord();
        RowWithLongestWord rowWithLongestWord = new RowWithLongestWord();
        WordsCount wordsCount = new WordsCount();

        fileReader.subscribe(longestLine);
        fileReader.subscribe(longestWord);
        fileReader.subscribe(rowWithLongestWord);
        fileReader.subscribe(wordsCount);

        fileReader.read();

        fileReader.setFilePath("task_3_1/resources/Alice_in_the_wonderland.txt");
        fileReader.read();
    }

}
