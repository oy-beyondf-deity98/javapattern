package pattern.divide.strategy;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 8:52
 * To change this template use File | Settings | File Templates.
 */
public class RandomStrategy implements Strategy{
    Random random = new Random();

    @Override
    public Hand nextHand() {

        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        System.out.println(win);
    }
}
