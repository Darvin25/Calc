import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение через пробел: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(calc(scan.nextLine()));
    }

    public static String calc(String input) {

        int result;
        int a = 0;
        int b = 0;

        String[] symbol = input.split(" ");
        if (symbol.length != 3){
            throw new IllegalArgumentException("Выражение должно быть формата: 1 + 1");
        }
        try {
            a = Integer.parseInt(symbol[0]);
            b = Integer.parseInt(symbol[2]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат выражения.");
        }

        if (a < 1 || a > 10 || b < 1 || b > 10){
            throw new IllegalArgumentException("Числа должны быть не меньше 1 и не больше 10");
        }

        switch (symbol[1]){
            case "+":
                System.out.println("Сумма чисел равна: ");
                result = a + b;
                break;
            case "-":
                System.out.println("Разность чисел равна: ");
                result = a - b;
                break;
            case "*":
                System.out.println("Результат умножения чисел равен: ");
                result = a * b;
                break;
            case "/":
                System.out.println("Результат деления чисел равен: ");
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция.");
        }
        return String.valueOf(result);
    }
}