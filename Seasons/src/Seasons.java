import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int input = scanner.nextInt();
        switch (input) {
            case 12, 1, 2 : System.out.println("Зима.");
            break;
            case 3, 4, 5 : System.out.println("Весна.");
            break;
            case 6, 7, 8 : System.out.println("Лето.");
            break;
            case 9, 10, 11 :  System.out.println("Осень.");
            break;
            default : System.out.println("Error.");
        }
    }
}
