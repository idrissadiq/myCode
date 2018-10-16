package shapes;

/* Idris Sadiq

** 01/30/2017

** This program prints an array of numbers to the console in three different 
   2D shapes. Each row of the shape uses arithmetic progrogession to 
   reduce the previous number by 7.
*/

public class Shapes {

    public static void main(String[] args) {
        // Initialize values for shape 1
        int start = 77; // Start value for arithmetic progression
        int step = 7;   // Reduction value for arithmetic progression
        // Nested loops for left-justified progression
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= (-1 * i + 10); j++){
                System.out.print("");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(start + " ");
            }
            System.out.println();
            start = start - step;   // Reduce previous number by 7
        }
        
        // Initialize values for shape 2
        start = 77;
        step = 7;
        // Nested loops for right-justified progression
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= (-1 * i + 10); j++){
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++){
               System.out.print(start + " ");
            }
            System.out.println();
            start = start - step;   // Reduce previous number by 7
        }
        
        // Initialize values for shape 3
        start = 77;
        step = 7;
        // Nested loops for pyramid progression
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= (-1 * i + 10); j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(start + "  ");
            }
            System.out.println();
            start = start - step;   // Reduce previous number by 7
        }
    }
}
