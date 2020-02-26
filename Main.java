public class Main {
    public static void main(String[] args) {

        int[] array = {4,1,10,11,2};

        Context bubble = new Context(new BubbleSort());
        bubble.arrange(array);

        Context quick = new Context(new QuickSort());
        quick.arrange(array);

        Context radix =  new Context(new RadixSort());
        radix.arrange(array);

    }
}
