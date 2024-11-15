package array;
import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {
       int[] a = { 1, 2, 3, 4 };
       int[] b = Arrays.copyOf(a, a.length);

       a[3] = 0;
       System.out.println(a[3]); //  Arrays.copyOf(a, a.length); 으로 인해 a는 값이 변경되었지만
       System.out.println(b[3]); // b는 변경되지 않음
    }
}
