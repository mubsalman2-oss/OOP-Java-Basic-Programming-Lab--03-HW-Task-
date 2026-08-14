  import java.util.Scanner;
  
    public class problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        int decimal = input.nextInt();

        System.out.println("Binary number is: " + Integer.toBinaryString(decimal));

        input.close();
    }
}
