public class LongestLine implements Subscriber {
    private String longestLine = "";
    private int biggestLength = 0;
    @Override
    public void onLineEvent(String line) {
        if(line.equals("END.")) {
            System.out.println("Longest line: "+ longestLine);
        }else{
            String[] words = line.split("\\s+");
            int charCount = 0;
            for (String word : words) {
                charCount += word.length();
            }

            if(charCount > biggestLength){
                longestLine = line;
                biggestLength = charCount;
            }
        }
    }
}
