import java.util.Scanner;
public class problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();
        System.out.println("Octal number is : " + Integer.toOctalString(decimal));
        input.close();
    }
}