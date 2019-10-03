public class Revision {

    public static void main(String args[]) {

        int units = 0;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0;
        
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;
        
        for(int x = 1000; x < 10000; x++) {

            i1 = x % 10;
            i2 = x % 100 / 10;
            i3 = x % 1000  / 100;
            i4 = x / 1000;
            
            units = units + i1;
            tens = tens + i2;
            hundreds = hundreds + i3;
            thousands = thousands + i4;
        }
        
        System.out.println("Units: " + units);
        System.out.println("Tens: " + tens);
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Thousands: " + thousands);
        
    }
}