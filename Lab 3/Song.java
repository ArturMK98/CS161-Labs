public class Song {
    public static void main(String args[]) {

        int i = 10;
        int y =  1;

        while(i >= y) {

            if(i > 1) {

                System.out.println(i + " in a bed and the little one said,");
                System.out.println("'Roll over, roll over'");
                System.out.println("They all rolled over and one fell out,");

            } else {

                System.out.println(y + " in a bed and the little one said,");
                System.out.println("'Alone at last'");
            }

            i--;
        }
    }
}