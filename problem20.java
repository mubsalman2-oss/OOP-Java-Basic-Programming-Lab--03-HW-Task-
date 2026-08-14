import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = input.nextInt();

        System.out.println("Hexadecimal number is : " + Integer.toHexString(decimal).toUpperCase());

        input.close();
    }
}
    
