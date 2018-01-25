import java.util.Random;

public class zad5 {

    public static void main(String[] args) {


        int[] tab = new int[10];
        Random rand=new Random();
        int i;
        double srednia;
        double suma=0;
        double suma2=0;
        double suma3=0;



        for (i = 0; i<tab.length; i++){
            tab[i] =rand.nextInt(10);
            suma+=tab[i];
        }

        srednia= suma/tab.length;

        for (i = 0; i<tab.length; i++){
            if (tab[i]<srednia)
            suma2+=tab[i];
            else suma3+=tab[i];
        }

        for (int liczba : tab) {
            System.out.print (liczba+" ");
        }

        System.out.println();
        System.out.println ("Średnia liczb z tablicy wynosi: "+ srednia);
        System.out.println ("Suma liczb mniejszych od średniej wynosi: "+ suma2);
        System.out.println ("Suma liczb większych od średniej wynosi: "+ suma3);


    }
}
