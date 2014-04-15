package pattern.instance.abstractFactory.factory;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 30.
 * Time: 오후 11:51
 * To change this template use File | Settings | File Templates.
 */
public abstract class Tray extends Item{

    protected ArrayList tray = new ArrayList();

    protected Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
