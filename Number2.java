import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.Arrays;

public class Number2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количетсво аргументов: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите аргументы: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
       // int[] array1 = new int[size];
        int numb = 0;
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    numb = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = numb;
            }
            }
        }
        System.out.println("По возрастанию: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int temp = 0;
        for (int i = 0,j = array.length-1; i < array.length/2; i++,j--) {
            temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        System.out.println("По убыванию: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}