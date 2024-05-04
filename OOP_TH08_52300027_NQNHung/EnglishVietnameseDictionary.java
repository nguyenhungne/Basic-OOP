import java.util.HashMap;
import java.util.Scanner;

public class EnglishVietnameseDictionary {

    private HashMap<String, String> dictionary;

    public EnglishVietnameseDictionary() {
        dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "quyển sách");
        dictionary.put("computer", "máy tính");
        dictionary.put("language", "ngôn ngữ");
        dictionary.put("world", "thế giới");
        dictionary.put("game", "trò chơi");
        dictionary.put("music", "âm nhạc");
        dictionary.put("movie", "phim");
        dictionary.put("school", "trường học");
        dictionary.put("university", "đại học");
    }

    public boolean checkWordExists(String word) {
        return dictionary.containsKey(word);
    }

    public String findWordMeaning(String word) {
        return dictionary.getOrDefault(word, "Từ này không có trong từ điển.");
    }

    public static void main(String[] args) {
        EnglishVietnameseDictionary evDictionary = new EnglishVietnameseDictionary();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập từ bạn muốn tra nghĩa (Để kết thúc nhập 'exit'):");
        while (true) {
            String word = scanner.nextLine().trim();
            if ("exit".equalsIgnoreCase(word)) {
                break;
            }

            if (evDictionary.checkWordExists(word)) {
                System.out.println("Nghĩa của từ '" + word + "' là: " + evDictionary.findWordMeaning(word));
            } else {
                System.out.println("Từ '" + word + "' không có trong từ điển.");
            }
        }
        scanner.close();
    }
}
