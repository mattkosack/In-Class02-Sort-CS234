import java.util.Arrays;

public class RadixSort implements Strategy {
    public void sort( int[] array) {
        int i, m = array[0];
        int exp = 1;
        int n = array.length;
        int[] b = new int[10];

        for (i = 1; i < n; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }

        while (m / exp > 0) {
            int[] bucket = new int[10];

            for (i = 0; i < n; i++) {
                bucket[(array[i] / exp) % 10]++;
            }
            for (i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for (i = n - 1; i >= 0; i--) {
                b[--bucket[(array[i] / exp) % 10]] = array[i];
            }
            for (i = 0; i < n; i++){
                array[i] = b[i];
            }
            exp *= 10;
        }

        System.out.println(Arrays.toString(array));
    }
}

