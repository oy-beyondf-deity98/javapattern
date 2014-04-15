package pattern.viewclass.command.drawer;

import pattern.viewclass.command.commnad.MacroCommand;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 12:24
 * To change this template use File | Settings | File Templates.
 */
public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width,height);
        setBackground(Color.white);
        this.history = history;
    }


    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x-radius,y-radius,radius*2,radius*2);
    }

    public void paint(Graphics g) {
        history.execute();
    }
}
