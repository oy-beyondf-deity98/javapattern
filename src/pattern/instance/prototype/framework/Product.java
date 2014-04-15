package pattern.instance.prototype.framework;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 8:37
 * To change this template use File | Settings | File Templates.
 */
public interface Product extends Cloneable {
    public void use(String s);
    public Product createClone();
}
