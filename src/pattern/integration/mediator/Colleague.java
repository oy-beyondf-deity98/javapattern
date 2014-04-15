package pattern.integration.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 3:41
 * To change this template use File | Settings | File Templates.
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);

    public abstract void setColleagueEnabled(boolean enabled);
}
