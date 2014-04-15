package pattern.divide.bridge;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 4:31
 * To change this template use File | Settings | File Templates.
 */
public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times){
        Random random = new Random();
        multiDisplay(random.nextInt(times));

    }
}
