package pattern.linked.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 12.
 * Time: 오전 6:32
 * To change this template use File | Settings | File Templates.
 */
public class BigString {
    private BigChar[] bigchars;

    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();

        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }

    }

    public void print() {
        for(int i=0; i<bigchars.length;i++){
            bigchars[i].print();
        }
    }
}
