package xs.design.strategy;

/**
 * Created by xs on 2018/11/6
 */
public class OperationMulti implements Strategy {
    @Override
    public int doOperation(int numberA, int numberB) {
        return numberA * numberB;
    }
}
