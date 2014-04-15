package pattern.recursive.process.chain;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 2:05
 * To change this template use File | Settings | File Templates.
 */
public class SpecialSupport extends Support {
    private int number;
    protected SpecialSupport(String name,int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() == number){
            return true;
        }else{
            return false;
        }

    }
}
