package pattern.viewclass.command.drawer;

import pattern.viewclass.command.commnad.Command;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 12:23
 * To change this template use File | Settings | File Templates.
 */
public class DrawCommand implements Command {
    private Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x,position.y);
    }
}
