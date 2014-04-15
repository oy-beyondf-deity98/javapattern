package pattern.recursive.process.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오후 11:26
 * To change this template use File | Settings | File Templates.
 */
public interface Element {
    public abstract void accept(Visitor v);
}
