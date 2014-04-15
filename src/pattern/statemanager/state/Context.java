package pattern.statemanager.state;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 2:09
 * To change this template use File | Settings | File Templates.
 */
public interface Context {
    public abstract void setClock(int hour);

    public abstract void changeState(State state);

    public abstract void callSecurityCenter(String msg);

    public abstract void recordLog(String msg);


}
