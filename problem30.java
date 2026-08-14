import java.util. Scanner;
public class problem30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        String hexadecimal = input.next();

        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println("Equivalent of octal number is: " + Integer.toOctalString(decimal));

        input.close();
    }
}
    

