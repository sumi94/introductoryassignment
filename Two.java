import java.util.*;

public class Two {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
    	int i =0;
    	while (i<number) {
    		System.out.print("*");
    		i = i + 1;
    	}
    	System.out.print("\n");
    }    
}