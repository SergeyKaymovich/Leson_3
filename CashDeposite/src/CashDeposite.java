import java.util.Scanner;

public class CashDeposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  сумму вклада:  ");
        float deposite = scanner.nextFloat();
        System.out.println("Введите количество месяцев:  ");
        int month = scanner.nextInt();

        if (deposite > 0  && month > 0){
            for (int i = 0; i < month; i++){
                deposite += deposite / 100 * 7;
                System.out.println(deposite);
            }
        }
        else {
            System.out.println("Неверные данные:  ");
        }
    }
}
