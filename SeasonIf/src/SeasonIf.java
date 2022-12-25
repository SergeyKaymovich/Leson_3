import java.util.Scanner;

public class SeasonIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца. ");
        int input = scanner.nextInt();
        if (input ==12 || input == 1|| input == 2){
            System.out.println("Зима.");
        }
        else if (input >= 3 && input <= 5){
            System.out.println("Весна.");
        }
        else if (input >= 6 && input <= 8){
            System.out.println("Лето.");
        }
        else if (input >= 9 && input <= 11){
            System.out.println("Осень");
        }
        else {
            System.out.println("Error.");
        }
    }
}
