import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100000 + (Math.random() * (200000 - 100000)));
        }
        String intAString = Arrays.toString(arr);
        System.out.println(intAString);
        double middle = 0;
        double summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        middle = summ / arr.length;
        String result = String.format("%.2f", middle);
        System.out.print("Средняя сумма трат за месяц составила "+ result +" рублей.");
    }
}

