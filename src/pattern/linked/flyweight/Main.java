package pattern.linked.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 12.
 * Time: 오전 6:16
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        String str = "9";
        BigString bs = new BigString(str);
        bs.print();
    }
}
