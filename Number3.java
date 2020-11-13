import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Number3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количетсво аргументов: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите аргументы: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
       // String a, b;
        Integer numb = 0;
      //  int count = 0;
        int sr = 0;
        int p = 0;
        for (int i = 0; i < array.length; i++) {
            numb = array[i];
            String str = Integer.toString(numb);
            //char[] carray = str.toCharArray();
            p = p + str.length();
        }
        sr = p / size;
      //  System.out.println(sr+"   " + p);
        //int st = 0;
        for (int i = 0; i < array.length; i++) {
            numb = array[i];
            String str = Integer.toString(numb);
            //char[] carray = str.toCharArray();
            if (sr > str.length()){
                System.out.println("Число длина которого меньше средней длины по всем числам: " + numb);
                System.out.println("Длина этого числа: " + str.length());
            }

        }
    }
}

