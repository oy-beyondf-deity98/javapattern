package pattern.viewclass.interpreter;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 13.
 * Time: 오전 1:10
 * To change this template use File | Settings | File Templates.
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
