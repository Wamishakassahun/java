import java.util.Scanner;

public class PrintAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any input to print characters from A to Z: ");
        String input = scanner.nextLine();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        scanner.close();
    }
}
