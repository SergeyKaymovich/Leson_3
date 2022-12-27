public class Fibonachi {
    public static void main(String[] args) {
        int [] massive = new int[11];
        massive[0] = 0;
        massive[1] = 1;

        for(int i = 2; i < 11; i++) {
            massive[i] = massive[i-1] + massive[i-2];
        }
        for(int result : massive) {
            System.out.println(result);
        }
    }
}
