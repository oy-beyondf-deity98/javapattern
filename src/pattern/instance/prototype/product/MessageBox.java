package pattern.instance.prototype.product;

import pattern.instance.prototype.framework.Product;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 27.
 * Time: 오전 8:55
 * To change this template use File | Settings | File Templates.
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar){
        this.decochar = decochar;
    }
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i=0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println(" ");
        System.out.println(decochar + " "+ s + " "+decochar);
        for(int i=0; i<length+4;i++){
            System.out.print(decochar);
        }

        System.out.println(" ");

    }

    @Override
    public Product createClone() {
        Product p = null;

        try {
            p=(Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
