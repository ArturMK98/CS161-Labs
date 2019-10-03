public class Palindrome {

    public static void main(String args[]) {

        String text = new String("navan");
        String   s1 = text.toUpperCase();
        
        int i1 = 0;
        int i2 = s1.length() -1;
        boolean IsApalindrome = true;

        while (i2 > i1) {

            if(s1.charAt(i1) != s1.charAt(i2)) {

                IsApalindrome = false;
            }
            
            i1++;
            i2--;
        }

        if(IsApalindrome) {

          System.out.println(s1 + " is a palindrome");

        } else {
            
         System.out.println(s1 + " is NOT a palindrome");
        }
    }
}