public class Selection2 {

    public static void main(String args[]) {

        char vehicle = 'c';
        char car = 'c';
        char motorbike = 'm';
        char bus = 'b';
        char truck = 't';
        //char van = 'v';
        
        if(vehicle == car) {

            System.out.println("Car - 2.00");

        } else if(vehicle == motorbike) {

            System.out.println("Motorbike - 1.10");

        } else if(vehicle == bus) {

            System.out.println("Bus - 4.25");

        } else if(vehicle == truck) {

            System.out.println("Truck - 6.70");

        } else {

            System.out.println("Van - 4.00");
        }
    }
}