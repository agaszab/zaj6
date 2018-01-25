import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        int x = 0;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj x:");
        x = scan.nextInt();

        while ((x * x) < 100) {
            sum += x;
            System.out.println("Podaj x:");
            x = scan.nextInt();
        }
        sum = sum % 2;
        System.out.println(sum);

    }

}

