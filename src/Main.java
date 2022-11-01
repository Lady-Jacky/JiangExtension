import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter an expression with *, /, +, -, %,or ^: ");
        String question = scan.nextLine();
        System.out.println(calc.calcSolve(question));
    }
}
