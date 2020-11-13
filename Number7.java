import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Number7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количетсво аргументов: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите аргументы: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        String  a, b;
        Integer numb = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            numb = array[i];
            String str = Integer.toString(numb);
            char[] carray = str.toCharArray();
            int p=str.length();
            for (int k = 0; k < str.length(); k++) {
                for (int j = k + 1; j < str.length(); j++) {
                    if (carray[k] == carray[j]) {
                        p--;
                    }
                }
            }
            if (p == str.length()){
                System.out.println("Уникальное число: " + numb);
            }
            if (p == str.length()) break;
        }
    }
}