package pattern.instance.prototype.product;

import pattern.instance.prototype.framework.Product;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 8:56
 * To change this template use File | Settings | File Templates.
 */
public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""+s+"\"");
        System.out.println(" ");
        for (int i = 0; i < length; i++) {
            System.out.println(ulchar);
        }
        System.out.println(ulchar);
    }

    @Override
    public Product createClone() {
        Product p = null;

        try {
            p=(Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return p;
    }
}
