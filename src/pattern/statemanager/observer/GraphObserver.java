package pattern.statemanager.observer;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 11.
 * Time: 오전 1:10
 * To change this template use File | Settings | File Templates.
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.println("*");
        }

        System.out.println("");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
