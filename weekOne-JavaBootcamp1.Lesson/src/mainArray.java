import java.util.Arrays;
import java.util.Scanner;
public class mainArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Java 8 arrays(değer atama)
        double[] doubles = {1.0, 2.5, 4.22};

        //Java Easy foreach
        for(double d:doubles){
            System.out.println(d);
        }

        System.out.println(Arrays.toString(doubles));
        //Java8: Array kolay çıktısı bu şekilde oluyor.
        //output: [1.0, 2.5, 4.22]
    }
}
