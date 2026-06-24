public class FlamesCalculator {

    public static char calculateFlames(int count) {

        StringBuilder flames = new StringBuilder("FLAMES");

        int index = 0;

        while (flames.length() > 1) {
            index = (index + count - 1) % flames.length();
            flames.deleteCharAt(index);
        }

        return flames.charAt(0);
    }
}