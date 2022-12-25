import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Введите число массивов:  ");
        int input = scanner.nextInt();
        int[] massive = new int[input];
        for (int i = 0; i < massive.length; i++){
            massive[i] = (int) (Math.random()*99);
            System.out.println("Элемент №:   " + i  + " - " + massive[i]);
        }

    }
}
