import java.util.*;

public class Factor {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        ArrayList<Integer> factors = new ArrayList<Integer>();
        Factor fact = new Factor();
        factors = fact.generate(number);
        System.out.println(factors);
        }
    private ArrayList<Integer> generate(int n) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
        int count;
        for (int i = 2; i<=(n); i++) {
            while (n % i == 0) {
                n /= i;
                list.add(i);
            }
    	}
    	return list;
    }
}

