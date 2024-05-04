public class BT1_lab5_String {

    public static void main(String args[]) {
        String name = "Nguyen Quoc Nhat Hung";
        System.out.println(shortName(name));
        System.out.println(hashTagName(name));
        System.out.println(uppercaseAllVowel(name));
        System.out.println(upperCaseAllN(name));
        
    }

    public static String shortName(String name) {
        String[] arrayName = name.split(" ");

        return arrayName[arrayName.length - 1] + arrayName[0];
    }

    public static String hashTagName (String name) {
        String[] arrayName = name.split(" ");

        return "#" + arrayName[arrayName.length - 1] + arrayName[0];
    }

    public static String uppercaseAllVowel (String name) {
        String[] arrayName = name.split(" ");
        String result = "";
        for (String string : arrayName) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                    result += Character.toUpperCase(string.charAt(i));
                } else {
                    result += string.charAt(i);
                }
            }
            result += " ";
        }
        return result;
    }

    public static String upperCaseAllN(String name) {
        for (char c : name.toCharArray()) {
            if (c == 'n') {
                name = name.replace(c, 'N');
            }
        }
        return name;
    }

}
