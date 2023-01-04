package forwhile;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        
        do {
            input = sc.nextLine();
            System.out.println(input);
        } while (!input.equals("x"));
        
        sc.close();
    }
}
