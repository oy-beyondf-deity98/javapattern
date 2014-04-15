package pattern.subclass.template;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 3. 20.
 * Time: 오전 8:21
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void close();
    public abstract void print();

    public final void display(){
        open();
        for(int i = 0;i<5;i++){
            print();
        }
        close();
    }

}
