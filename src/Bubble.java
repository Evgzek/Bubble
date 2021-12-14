import java.util.Arrays;
import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int a;
        a = p.nextInt();
        int[] array = new int[a];
        for (int i=0; i<a; i++){
            System.out.println("Введите элемент: ");
            array[i] = p.nextInt();
        }
        System.out.println( "Ваш массив: "+ Arrays.toString(array));
    }
}
