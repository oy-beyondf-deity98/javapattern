package pattern.instance.builder;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 30.
 * Time: 오후 10:31
 * To change this template use File | Settings | File Templates.
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
