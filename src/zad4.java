public class zad4 {

    public static void main(String[] args) {

        int i=0;

        for (i=0; i<=100; i++) {

            if ((i%3==0)&&(i%5==0)) {  // można uprościć warunek do (i%15==0)
                System.out.println(i+ "FizzBuzz");
            } else if (i%3==0) {
                System.out.println(i+ "Fizz");
            } else if (i%5==0) {
                System.out.println(i+ "Buzz");
            }


        }


    }
}
