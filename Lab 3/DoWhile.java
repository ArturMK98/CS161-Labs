public class DoWhile {

    public static void main(String args[]) {

        int num = 13;
        //int count = 0;

        do {

            if(num % 1 == 0) {

                System.out.println(num + " is a prime number");
                num++;

            } else {

                System.out.println(num + " is NOT a prime number");
            }

        } while (num < 14);
    }
}