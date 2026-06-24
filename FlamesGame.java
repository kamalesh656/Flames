import java.util.Scanner;

public class FlamesGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name1 = sc.nextLine()
                .toLowerCase()
                .replace(" ", "");

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine()
                .toLowerCase()
                .replace(" ", "");

        int count = FlamesUtils.removeCommonLetters(name1, name2);

        char result = FlamesCalculator.calculateFlames(count);

        FlamesResult.displayResult(result);

        sc.close();
    }
}