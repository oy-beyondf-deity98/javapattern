package pattern.recursive.process.chain;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 2:05
 * To change this template use File | Settings | File Templates.
 */
public class LimitSupport extends Support {
    private int limit;

    protected LimitSupport(String name,int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() < limit){
            return true;
        }else{
            return false;
        }

    }
}
