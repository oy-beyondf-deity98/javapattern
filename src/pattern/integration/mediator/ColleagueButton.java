package pattern.integration.mediator;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 3:43
 * To change this template use File | Settings | File Templates.
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
