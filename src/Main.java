import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = rnd.nextInt( 100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Сумма трат за месяц составила " + arr[i] + " рублей");
        }
    }
}







