package pattern.linked.flyweight;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 12.
 * Time: 오전 6:30
 * To change this template use File | Settings | File Templates.
 */
public class BigCharFactory {
    private HashMap pool = new HashMap();
    private static BigCharFactory singleton = new BigCharFactory();

    private void BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar)pool.get(" "+charname);

        if (bc == null) {
            bc = new BigChar(charname);
            pool.put(" "+charname,bc);
        }

        return bc;

    }
}
