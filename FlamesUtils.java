public class FlamesUtils {

    public static int removeCommonLetters(String name1, String name2) {

        StringBuilder a = new StringBuilder(name1);
        StringBuilder b = new StringBuilder(name2);

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            int index = b.indexOf(String.valueOf(ch));

            if (index != -1) {
                a.deleteCharAt(i);
                b.deleteCharAt(index);
                i--;
            }
        }

        return a.length() + b.length();
    }
}