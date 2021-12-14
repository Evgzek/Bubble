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
        for (int i = a-1; i>=1; i--){
            for (int g = 0; g<i; g++){
                if(array[g]>array[g+1]){
                    int e = array[g];
                    array[g] = array[g+1];
                    array[g+1] = e;
                }
            }
        }
        System.out.println("Массив прошедший сортировку: " + Arrays.toString(array));
    }
}
