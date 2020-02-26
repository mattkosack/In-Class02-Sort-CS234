import java.util.Arrays;

public class QuickSort implements Strategy {

    int[] array;

    public void sort(int[] numbers) {
        this.array = numbers;
        quicksort(0, numbers.length - 1);

        System.out.println(Arrays.toString(array));
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = array[low + (high-low) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j){
            quicksort(low, j);
        }

        if (i < high){
            quicksort(i, high);
        }
    }

    private void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
