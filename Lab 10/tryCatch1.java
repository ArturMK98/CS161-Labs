import java.util.Scanner;
public class tryCatch1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int array[] = new int [5];  //new integer array of size 5
        int sum = 0;                //will hold the value of the sum of the inputs
        int product = 1;            //will hold the value of the product of the inputs
        
        //for loop to assign each element of the array an integer value
        for(int i=0;i<array.length;i++) {
            
            array[i]=sc.nextInt();
        }
        sc.close(); //Closes the Scanner
        
        /*  Assigns product the product of each value in the array
        *   Assigns sum the sum of each value in the array
        */
        
        try{

        for(int i=0;i<=array.length;i++) {

            System.out.print(array[i] + " ");
            product=product*array[i];
            sum=sum+array[i];
        }
        
        } catch(ArrayIndexOutOfBoundsException e) {
            
            System.out.println();
            System.out.println("An error has occurred.");
            
        } finally {
        
        //prints the product and sum variables contents to the screen
        System.out.println("Product: "+product);
        System.out.println("Sum: "+sum);
        
        } 
    }
}