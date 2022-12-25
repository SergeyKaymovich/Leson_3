import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();
        int c = 0;
        for (int i = 1; i <= input;  i++){
          c += i;
                System.out.println(c);
            }
        }
    }
