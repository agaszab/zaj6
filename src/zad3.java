import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double x;

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę a:");
        a=scan.nextDouble();
        while (a==0) {
            System.out.println("Podaj jeszcze raz liczbę a:");
            a=scan.nextDouble();}

        System.out.println("Podaj liczbę b:");
        b=scan.nextDouble();

        System.out.println("Podaj liczbę c:");
        c=scan.nextDouble();

        x=(c-b)/a;

        System.out.println("x= "+x);



    }

}
