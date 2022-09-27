import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100000 + (Math.random() * (200000 - 100000)));
        }
        String intAString = Arrays.toString(arr);
        System.out.println(intAString);
        int max = 0;
        int min = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
    }
}

