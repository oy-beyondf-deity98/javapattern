package pattern.recursive.process.chain;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 2:05
 * To change this template use File | Settings | File Templates.
 */
public class OddSupport extends Support {
    protected OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() %2 ==1){
            return true;
        }else{
            return false;
        }

    }
}
