package pattern.integration.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 3:44
 * To change this template use File | Settings | File Templates.
 */
public class ColleagueTextField extends TextField implements TextListener,Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
       this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ?Color.white:Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent textEvent) {
        mediator.colleagueChanged();
    }
}
