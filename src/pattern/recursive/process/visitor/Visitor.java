package pattern.recursive.process.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 9.
 * Time: 오후 11:26
 * To change this template use File | Settings | File Templates.
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);

}
