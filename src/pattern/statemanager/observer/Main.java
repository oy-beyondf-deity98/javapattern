package pattern.statemanager.observer;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 11.
 * Time: 오전 1:05
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
