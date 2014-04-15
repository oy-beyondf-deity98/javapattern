package pattern.recursive.process.chain;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 2:05
 * To change this template use File | Settings | File Templates.
 */
public class NoSupport extends Support {
    protected NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
