public class Palindrom {


   boolean isPalindrom (int[] tab) {

       String odPoczatku="";
       String odKonca="";
       int i=0;
       boolean palindrom=false;

       for (i = 0; i<tab.length; i++){
           odPoczatku+=tab[i];
       }


       for (i = tab.length-1; i >=0; i--) {
           odKonca+=tab[i];

       }

       System.out.println (odPoczatku);
       System.out.println(odKonca);

       if (odPoczatku.equals(odKonca)) palindrom=true;

       return palindrom;


   }



}
