import java.util. Scanner;
public class problem27 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a octal number : ");
        String octal = input.next();

        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Equivalent hexadecimal number: " + Integer.toHexString(decimal).toUpperCase());

        input.close();
    }
}
    

