public class BT2_lab5_String {
    public static void main( String args[] )  {
        String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        System.out.println(countWord(paragraph));
        System.out.println(countSentences(paragraph));
        System.out.println(countAppear(paragraph, "Will"));
    }


    public static int countWord(String paragraph) {
        String[] words = paragraph.split(" ");
        return words.length;
    }

    public static int countSentences(String paragraph) {
        String[] sentences = paragraph.split("[.!?]");
        return sentences.length;
    }

    public static int countAppear(String paragraph, String word) {
        String[] words = paragraph.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}
