import java.util.Scanner;

/**
 * Created on 13.06.17
 *
 * @author me
 */
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double first = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double second = scanner.nextDouble();
        System.out.print("Выберете операцию (\"+\", \"-\", \"*\", \"/\"): ");
        String operation = scanner.next();
        scanner.close();
        if ("+".equals(operation)) {
            System.out.printf("%.4f", add(first, second));
        } else {
            System.out.println("Операция не реализована.");
        }
    }

    /**
     * Возвращает сумму дробрых чисел.
     *
     * @param first  первое слагаемое
     * @param second второе слагаемое
     * @return сумма
     */
    public static double add(double first, double second) {
        return first + second;
    }
}
