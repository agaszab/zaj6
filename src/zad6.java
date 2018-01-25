

public class zad6 {

    public static void main(String[] args) {


        int[] tab = {1, 2, 3, 4, 4, 3, 2, 1,7};

        Palindrom pal = new Palindrom();

        if (pal.isPalindrom(tab))
            System.out.println("Liczba utworzona z połączenia cyfr w jedną liczbę jest palindromem");
        else System.out.println("Liczba utworzona z połączenia cyfr w jedną liczbę nie jest palindromem");

    }
}
