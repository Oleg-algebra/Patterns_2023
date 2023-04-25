public class LongestWord implements Subscriber {
    private String longestWord = "";
    @Override
    public void onLineEvent(String line) {
        if(line.equals("END.")){
            System.out.println("Longest word: "+ longestWord);
        }else{
            String[] words = line.split("\\s+");
            for (String word : words) {
                if(word.length() > longestWord.length()){
                    longestWord = word;
                }
            }

        }
    }
}
