public class Main {
    public static void main(String[] args) {

        int[] array = {27,4,1,10,11,2};

        Context sort = new Context(new BubbleSort());
        sort.arrange(array);

        sort.changeSort(new QuickSort());
        sort.arrange(array);

        sort.changeSort(new RadixSort());
        sort.arrange(array);

    }
}
