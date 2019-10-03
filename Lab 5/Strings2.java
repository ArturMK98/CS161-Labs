public class Strings2 {

    public static void main(String args[]) {
        
        String s1 = new String("Most guitars have six strings.");

        int s1L = s1.length();
        System.out.println("String Length: "+ s1L);
            
        int s1i = s1.indexOf('h');
        System.out.println("Position of first 'h': " + s1i);
            
        String lc = s1.toLowerCase();
        System.out.println(lc);
            
        String uc = s1.toUpperCase();
        System.out.println(uc);

    }
}