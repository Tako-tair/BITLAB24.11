package FinalProj1;

import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] res = new int[n];
        int index = 0, k = 0, length = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    index++;
                }
            }
            if(index==1) {
                res[k] = arr[i];
                k++;
                length++;
            }
            index = 0;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(res[i]);
        }
    }
}
