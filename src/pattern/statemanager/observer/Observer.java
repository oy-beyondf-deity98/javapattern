package pattern.statemanager.observer;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 11.
 * Time: 오전 1:06
 * To change this template use File | Settings | File Templates.
 */
public interface Observer {
    public abstract void update(NumberGenerator generator);
}
