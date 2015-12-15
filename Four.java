import java.util.*;

public class Four {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        for (int i=1; i<=number; i++) {
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }    
}