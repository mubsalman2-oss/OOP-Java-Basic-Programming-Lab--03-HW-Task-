import java.util. Scanner;
public class problem24 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binary = input.next();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Octal number: " + Integer.toOctalString(decimal));

        input.close();
    }
}
    
