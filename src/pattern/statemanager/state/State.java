package pattern.statemanager.state;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 2:10
 * To change this template use File | Settings | File Templates.
 */
public interface State {
    void doClock(Context context, int hour);

    void doUse(Context context);

    void doAlarm(Context con);

    void doPhone(Context context);
}
