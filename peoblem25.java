import java.util. Scanner;
public class peoblem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input any octal number: ");
        String octal = input.next();

        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Equivalent decimal number: " + decimal);

        input.close();
    }
}
