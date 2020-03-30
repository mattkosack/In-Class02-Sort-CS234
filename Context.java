public class Context {

    Strategy strategy;

    public Context(Strategy strat){
        strategy = strat;
    }

    public void arrange(int[] array){
        strategy.sort(array);
    }

    public void changeSort(Strategy newStrat){
        strategy = newStrat;
    }

}
