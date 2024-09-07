import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        String number = scanner.nextLine();
        Scanner lineScanner = new Scanner(number);
        int firstnumber = lineScanner.nextInt();
        String[] numbers = number.split(" ");
        if (numbers.length < 2) {
            System.out.println("Неверно заданный диапазон: количество введенных чисел =" + numbers.length);
            return;
        }
        int secondnumber = lineScanner.nextInt();
        if (numbers.length > 2) {
            System.out.println("Неверно заданный диапазон: количество введенных чисел =" + numbers.length);
        }

        if (secondnumber > 1000000) {
            System.out.println("Неверно заданный диапазон");
            return;
        }
        if (firstnumber < 0) {
            System.out.println("Число должно быть положительным:" + firstnumber);
            return;
        }
        if (secondnumber < 0) {
            System.out.println("Число должно быть положительным:" + secondnumber);
            return;
        }
        if (firstnumber > secondnumber) {
            System.out.println("Верхняя граница должна быть больше нижней: нижняя граница =" + firstnumber + ", верхняя граница = " + secondnumber);
            return;
        }
        Random random = new Random();
        int randomNumber = random.nextInt(secondnumber - firstnumber + 1) + firstnumber;
        System.out.println("Сгенерированное число = "+ randomNumber +" в диапазоне от "+firstnumber +" до "+ secondnumber);
    }
}