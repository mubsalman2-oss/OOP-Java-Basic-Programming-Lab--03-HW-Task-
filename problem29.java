import java.util. Scanner;
public class problem29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number : ");
        String hexadecimal = input.next();

        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println("Equivalent Binary Number is: " + Integer.toBinaryString(decimal));

        input.close();
    }
}
    
