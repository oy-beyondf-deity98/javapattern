package pattern.instance.prototype;

import pattern.instance.prototype.framework.Manager;
import pattern.instance.prototype.framework.Product;
import pattern.instance.prototype.product.MessageBox;
import pattern.instance.prototype.product.UnderlinePen;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 8:38
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
