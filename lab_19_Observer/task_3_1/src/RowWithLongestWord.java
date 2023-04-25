public class RowWithLongestWord implements Subscriber {
    private String longestWord = "";
    private  String chosenLine = "";
    @Override
    public void onLineEvent(String line) {
        if(line.equals("END.")){
            System.out.printf("Line: %s --- has longest word: %s\n",chosenLine,longestWord);
        }else{
            String[] words = line.split("\\s+");
            for (String word : words) {
                if(word.length() > longestWord.length()){
                    longestWord = word;
                    chosenLine = line;
                }
            }

        }
    }
}
