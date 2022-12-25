import java.util.Scanner;

public class MultipleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();
        for (;  input >= 0; input++){
            if(input % 5 == 0){
                System.out.println(input);
                break;
            }
        }
    }
}
