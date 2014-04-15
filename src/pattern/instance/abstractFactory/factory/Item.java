package pattern.instance.abstractFactory.factory;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 30.
 * Time: 오후 11:48
 * To change this template use File | Settings | File Templates.
 */
public abstract class Item {
    protected String caption;

    protected Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
