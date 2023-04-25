public class WordsCount implements Subscriber {
    private int wordsNumber = 0;
    @Override
    public void onLineEvent(String line) {
        if(line.equals("END.")){
            System.out.println("Word count = "+wordsNumber);
        }else{
            String[] words = line.split("\\s+");
            wordsNumber += words.length;
        }
    }
}
