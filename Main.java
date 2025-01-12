import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Number System Converter ---");
            System.out.println("1. Binary to Other Systems");
            System.out.println("2. Decimal to Other Systems");
            System.out.println("3. Octal to Other Systems");
            System.out.println("4. Hexadecimal to Other Systems");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a Binary number: ");
                    String binary = scanner.nextLine();
                    if (binary.matches("[01]+")) {
                        NumberConverter.binaryToOthers(binary);
                    } else {
                        System.out.println("Invalid Binary number!");
                    }
                    break;

                case 2:
                    System.out.print("Enter a Decimal number: ");
                    int decimal = scanner.nextInt();
                    NumberConverter.decimalToOthers(decimal);
                    break;

                case 3:
                    System.out.print("Enter an Octal number: ");
                    String octal = scanner.nextLine();
                    if (octal.matches("[0-7]+")) {
                        NumberConverter.octalToOthers(octal);
                    } else {
                        System.out.println("Invalid Octal number!");
                    }
                    break;

                case 4:
                    System.out.print("Enter a Hexadecimal number: ");
                    String hex = scanner.nextLine();
                    if (hex.matches("[0-9A-Fa-f]+")) {
                        NumberConverter.hexToOthers(hex);
                    } else {
                        System.out.println("Invalid Hexadecimal number!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
