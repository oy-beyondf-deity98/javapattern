package pattern.viewclass.command.commnad;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 12:22
 * To change this template use File | Settings | File Templates.
 */
public class MacroCommand implements Command {
    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();

        while (it.hasNext()) {
            it.next().execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
