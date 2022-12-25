import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        int input = scanner.nextInt();
        if (input >- 5){
            System.out.println("Тепло.");
        }
        else  if (input >= -20){
            System.out.println("Нормально.");
        }
        else {
            System.out.println("Холодно.");
        }
    }
}
