public class NumberConverter {
    // Converts Binary to Decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    // Converts Decimal to Binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Converts Octal to Decimal
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    // Converts Decimal to Octal
    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    // Converts Hexadecimal to Decimal
    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    // Converts Decimal to Hexadecimal
    public static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    // Converts Binary to Other Systems
    public static void binaryToOthers(String binary) {
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + decimalToOctal(decimal));
        System.out.println("Hexadecimal: " + decimalToHex(decimal));
    }

    // Converts Octal to Other Systems
    public static void octalToOthers(String octal) {
        int decimal = octalToDecimal(octal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + decimalToBinary(decimal));
        System.out.println("Hexadecimal: " + decimalToHex(decimal));
    }

    // Converts Hexadecimal to Other Systems
    public static void hexToOthers(String hex) {
        int decimal = hexToDecimal(hex);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + decimalToBinary(decimal));
        System.out.println("Octal: " + decimalToOctal(decimal));
    }

    // Converts Decimal to Other Systems
    public static void decimalToOthers(int decimal) {
        System.out.println("Binary: " + decimalToBinary(decimal));
        System.out.println("Octal: " + decimalToOctal(decimal));
        System.out.println("Hexadecimal: " + decimalToHex(decimal));
    }
}
