package pattern.statemanager.state;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 2:14
 * To change this template use File | Settings | File Templates.
 */
public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {}

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(9<=hour && hour < 17){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상 : 야간금고 사용!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야간)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("야간통화 녹음");
    }

    @Override
    public String toString() {
        return "[야간]";
    }
}
