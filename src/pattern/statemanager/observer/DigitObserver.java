package pattern.statemanager.observer;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 11.
 * Time: 오전 1:10
 * To change this template use File | Settings | File Templates.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:"+generator.getNumber());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
