import java.util.*;

public class Six {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        for (int i=1; i<=number; i++) {
            for (int j=i; j<number; j++){
                System.out.print(" ");
            }
            for (int k=0; k<(i+i-1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=(number-1); i>0; i--) {
            for (int j=i; j<number; j++){
                System.out.print(" ");
            }
            for (int k=0; k<(i+i-1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }    
}