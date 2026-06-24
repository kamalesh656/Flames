public class FlamesResult {

    public static void displayResult(char result) {

        switch (result) {

            case 'F':
                System.out.println("Relationship: Friends");
                break;

            case 'L':
                System.out.println("Relationship: Love");
                break;

            case 'A':
                System.out.println("Relationship: Attraction");
                break;

            case 'M':
                System.out.println("Relationship: Marriage");
                break;

            case 'E':
                System.out.println("Relationship: Enemy");
                break;

            case 'S':
                System.out.println("Relationship: Sister");
                break;

            default:
                System.out.println("Invalid Result");
        }
    }
}