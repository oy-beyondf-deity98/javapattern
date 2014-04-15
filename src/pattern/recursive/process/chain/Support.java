package pattern.recursive.process.chain;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 10.
 * Time: 오전 2:04
 * To change this template use File | Settings | File Templates.
 */
public abstract class Support {
    private String name;
    private Support next;

    protected Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if(next != null){
            next.support(trouble);
        }


    }


    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble){
        System.out.println(trouble + " is resolved by "+this+".");
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved"+this+".");
    }

    @Override
    public String toString() {
        return "[" + name  + "]";
    }
}
