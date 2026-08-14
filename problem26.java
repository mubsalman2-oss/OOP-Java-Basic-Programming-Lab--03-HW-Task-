import java.util. Scanner;
public class problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input any octal number: ");
        String octal = input.next();

        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Equivalent binary number: " + Integer.toBinaryString(decimal));

        input.close();
    }
}

