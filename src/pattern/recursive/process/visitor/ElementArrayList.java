package pattern.recursive.process.visitor;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 1:27
 * To change this template use File | Settings | File Templates.
 */
public abstract class ElementArrayList extends ArrayList implements Element{

    @Override
    public abstract void accept(Visitor v);
}
