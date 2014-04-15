package pattern.viewclass.interpreter;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 1:09
 * To change this template use File | Settings | File Templates.
 */
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();

        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat "+number + " " + commandListNode + "]";
    }
}
