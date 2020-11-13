import java.util.Scanner;
import java.util.Arrays;

public class Number {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Количетсво аргументов: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите аргументы: ");
        for (int i = 0;i < array.length;i++){
            array[i]  = input.nextInt();
        }
        int min1 = Arrays.stream(array).min().getAsInt();
        int max1 = Arrays.stream(array).max().getAsInt();
        System.out.println("Максимально длиное число = " + max1);
        System.out.println("Минимально длиное числ0 = " + min1);
        int[] array1 = new int[size];
        int numb = 0;
        int count = 0;
        for (int i = 0;i < array.length;i++){
            numb = array[i];
            while(numb>0){
                numb/=10;
                count++;
            }
                array1[i] = count;
                System.out.println("Длина " + i + "-го" + " числа "+ count);
                count=0;
            }
        int min = Arrays.stream(array1).min().getAsInt();
        int max = Arrays.stream(array1).max().getAsInt();

        System.out.println("Максимальная длина числа = " + max);
        System.out.println("Минимальная длина числа = " + min);

    }
}
