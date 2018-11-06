package xs.design.strategy;

/**
 * Created by xs on 2018/11/6
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationMulti());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
