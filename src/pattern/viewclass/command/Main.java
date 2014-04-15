package pattern.viewclass.command;

import pattern.viewclass.command.commnad.Command;
import pattern.viewclass.command.commnad.MacroCommand;
import pattern.viewclass.command.drawer.DrawCanvas;
import pattern.viewclass.command.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 12:17
 * To change this template use File | Settings | File Templates.
 */
public class Main extends JFrame implements ActionListener,MouseMotionListener,WindowListener{
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400,400,history);
    private JButton clearButton = new JButton("clear");

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas,e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }


    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void windowOpened(WindowEvent windowEvent) {}



    @Override
    public void windowClosed(WindowEvent windowEvent) {}

    @Override
    public void windowIconified(WindowEvent windowEvent) {}

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {}

    @Override
    public void windowActivated(WindowEvent windowEvent) {}

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {}
}
