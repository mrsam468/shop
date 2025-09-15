package Store;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    public String name = scanner.next();
    public int number(){
        int amount = scanner.nextInt();
        return amount;
    }

}
