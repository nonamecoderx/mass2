import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100000 + (Math.random() * (200000 - 100000)));
        }
        String intAString = Arrays.toString(arr);
        System.out.println(intAString);
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");
    }
}

