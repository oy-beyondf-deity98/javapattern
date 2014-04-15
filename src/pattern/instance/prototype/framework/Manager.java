package pattern.instance.prototype.framework;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 8:50
 * To change this template use File | Settings | File Templates.
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto){
        showcase.put(name,proto);
    }

    public Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
