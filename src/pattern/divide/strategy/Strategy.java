package pattern.divide.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 6.
 * Time: 오후 6:08
 * To change this template use File | Settings | File Templates.
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
